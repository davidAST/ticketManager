import { useEffect } from "react";
import { useAuth } from "react-oidc-context";
import { useNavigate } from "react-router";
import { jwtDecode } from "jwt-decode";

const CallbackPage: React.FC = () => {
  const { isLoading, isAuthenticated, error, user } = useAuth();
  const navigate = useNavigate();

  useEffect(() => {
    if (!isLoading && isAuthenticated) {
      const redirectPath = localStorage.getItem("redirectPath");
      localStorage.removeItem("redirectPath");

      if (redirectPath) {
        navigate(redirectPath, { replace: true });
      } else {
        const decoded: any = jwtDecode(user?.access_token ?? "");
        const roles: string[] = decoded?.realm_access?.roles ?? [];
        if (roles.includes("ROLE_ORGANIZER")) {
          navigate("/organizers", { replace: true });
        } else {
          navigate("/", { replace: true });
        }
      }
    }
  }, [isLoading, isAuthenticated, navigate, user]);

  if (error) {
    return <p>Error en login: {error.message}</p>;
  }

  if (isLoading) {
    return <p>Processing login...</p>;
  }

  return <p>Completing login...</p>;
};

export default CallbackPage;
