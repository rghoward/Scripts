package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {206}, m = "notifySubscribers")
public final class pm9 extends u02 {
    public String t;
    public om9.b u;
    public /* synthetic */ Object v;
    public final /* synthetic */ om9 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm9(om9 om9Var, r02<? super pm9> r02Var) {
        super(r02Var);
        this.w = om9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return om9.d(this.w, null, null, this);
    }
}
