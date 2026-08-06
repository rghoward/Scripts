package defpackage;

import io.ably.lib.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {98, Log.NONE}, m = "updateSettings")
public final class ui9 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ vi9 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui9(vi9 vi9Var, u02 u02Var) {
        super(u02Var);
        this.u = vi9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(this);
    }
}
