package defpackage;

import android.os.Bundle;
import io.ably.lib.http.HttpCore;
import io.ably.lib.rest.MessageEditsMixin;
import io.ably.lib.types.ErrorInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ei3 implements pf4, HttpCore.ResponseHandler {
    public final /* synthetic */ Object t;

    public /* synthetic */ ei3(Object obj) {
        this.t = obj;
    }

    @Override // defpackage.pf4
    public void d(Bundle bundle, String str) {
        fi3 fi3Var = (fi3) this.t;
        fi3.a aVar = fi3.Companion;
        if (bundle.getBoolean("arg_dialog_is_confirmed")) {
            fi3Var.r().x.a();
        }
    }

    @Override // io.ably.lib.http.HttpCore.ResponseHandler
    public Object handleResponse(HttpCore.Response response, ErrorInfo errorInfo) {
        return MessageEditsMixin.lambda$getMessageImpl$0((HttpCore.BodyHandler) this.t, response, errorInfo);
    }
}
