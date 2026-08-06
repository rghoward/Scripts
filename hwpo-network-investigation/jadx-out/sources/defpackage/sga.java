package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", l = {827}, m = "updateClipboardEntry$foundation", v = 1)
public final class sga extends u02 {
    public qga t;
    public /* synthetic */ Object u;
    public final /* synthetic */ qga v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sga(qga qgaVar, u02 u02Var) {
        super(u02Var);
        this.v = qgaVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.s(this);
    }
}
