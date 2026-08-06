package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.data.CommentsRepositoryImpl", f = "CommentsRepositoryImpl.kt", l = {153, 154, 158, 159, 166, 174}, m = "addCommentWithAttachments", v = 2)
public final class rm1 extends u02 {
    public gl8 A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ dn1 E;
    public int F;
    public pk1 t;
    public gl8 u;
    public gl8 v;
    public Iterator w;
    public m89 x;
    public gl8 y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm1(dn1 dn1Var, u02 u02Var) {
        super(u02Var);
        this.E = dn1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.l(null, null, this);
    }
}
