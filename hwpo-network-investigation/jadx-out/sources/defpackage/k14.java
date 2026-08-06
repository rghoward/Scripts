package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k14 extends gv7 {
    public static final dp d = dp.d();
    public final z97 b;
    public final Context c;

    public k14(z97 z97Var, Context context) {
        this.c = context;
        this.b = z97Var;
    }

    @Override // defpackage.gv7
    public final boolean a() {
        URI uriCreate;
        z97 z97Var = this.b;
        String strV = z97Var.V();
        boolean zIsEmpty = strV == null ? true : strV.trim().isEmpty();
        dp dpVar = d;
        if (zIsEmpty) {
            dpVar.f("URL is missing:" + z97Var.V());
            return false;
        }
        String strV2 = z97Var.V();
        if (strV2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(strV2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                dpVar.g("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            dpVar.f("URL cannot be parsed");
            return false;
        }
        Context context = this.c;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            dp.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (bzb.u == null) {
                bzb.u = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = bzb.u;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        dpVar.f("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            dpVar.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            dpVar.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            dpVar.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            dpVar.f("URL port is less than or equal to 0");
            return false;
        }
        z97.c cVarN = z97Var.X() ? z97Var.N() : null;
        if (cVarN == null || cVarN == z97.c.HTTP_METHOD_UNKNOWN) {
            dpVar.f("HTTP Method is null or invalid: " + z97Var.N());
            return false;
        }
        if (z97Var.Y() && z97Var.O() <= 0) {
            dpVar.f("HTTP ResponseCode is a negative value:" + z97Var.O());
            return false;
        }
        if (z97Var.Z() && z97Var.Q() < 0) {
            dpVar.f("Request Payload is a negative value:" + z97Var.Q());
            return false;
        }
        if (z97Var.a0() && z97Var.R() < 0) {
            dpVar.f("Response Payload is a negative value:" + z97Var.R());
            return false;
        }
        if (!z97Var.W() || z97Var.L() <= 0) {
            dpVar.f("Start time of the request is null, or zero, or a negative value:" + z97Var.L());
            return false;
        }
        if (z97Var.b0() && z97Var.S() < 0) {
            dpVar.f("Time to complete the request is a negative value:" + z97Var.S());
            return false;
        }
        if (z97Var.d0() && z97Var.U() < 0) {
            dpVar.f("Time from the start of the request to the start of the response is null or a negative value:" + z97Var.U());
            return false;
        }
        if (!z97Var.c0() || z97Var.T() <= 0) {
            dpVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + z97Var.T());
            return false;
        }
        if (z97Var.Y()) {
            return true;
        }
        dpVar.f("Did not receive a HTTP Response Code");
        return false;
    }
}
