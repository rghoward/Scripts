package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import defpackage.aa;
import defpackage.o03;
import defpackage.qu8;
import defpackage.su8;
import defpackage.tu8;
import defpackage.vg5;
import defpackage.wq6;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ShutdownInterceptor implements vg5 {
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private static final String MESSENGER_SHUTDOWN_RESPONSE = "messenger_shutdown_response";
    private static final String SHUTDOWN_PERIOD = "shutdown_period";
    private static final String TYPE = "type";
    private final ShutdownState shutdownState;
    private final Twig twig = LumberMill.getLogger();

    public ShutdownInterceptor(ShutdownState shutdownState) {
        this.shutdownState = shutdownState;
    }

    @Override // defpackage.vg5
    public qu8 intercept(vg5.a aVar) throws IOException {
        if (!this.shutdownState.canSendNetworkRequests()) {
            this.twig.e(this.shutdownState.getShutdownReason(), new Object[0]);
            o03.a(this.shutdownState.getShutdownReason());
            return null;
        }
        qu8 qu8VarA = aVar.a(aVar.request());
        if (!qu8VarA.J) {
            su8 su8Var = qu8VarA.z;
            String strT = su8Var.t();
            qu8.a aVarK = qu8VarA.k();
            wq6 wq6VarM = su8Var.m();
            tu8 tu8Var = su8.u;
            strT.getClass();
            aVarK.g = su8.b.a(strT, wq6VarM);
            qu8VarA = aVarK.a();
            su8Var.close();
            try {
                JSONObject jSONObject = new JSONObject(strT).getJSONObject(ERROR);
                if (jSONObject.getString(TYPE).equals(MESSENGER_SHUTDOWN_RESPONSE)) {
                    long j = jSONObject.getLong(SHUTDOWN_PERIOD);
                    this.shutdownState.updateShutdownState(TimeUnit.SECONDS.toMillis(j), jSONObject.getString("message"));
                }
                return qu8VarA;
            } catch (JSONException unused) {
                Twig twig = this.twig;
                StringBuilder sbA = aa.a("Failed to deserialise error response: `", strT, "` message: `");
                sbA.append(qu8VarA.v);
                sbA.append("`");
                twig.internal(sbA.toString());
            }
        }
        return qu8VarA;
    }
}
