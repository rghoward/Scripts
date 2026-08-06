package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", l = {369, 380}, m = "classifyText-M8tDOmk", v = 1)
public final class k18 extends u02 {
    public CharSequence t;
    public Object u;
    public a47 v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ o18 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k18(o18 o18Var, u02 u02Var) {
        super(u02Var);
        this.y = o18Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return o18.d(this.y, null, 0L, null, this);
    }
}
