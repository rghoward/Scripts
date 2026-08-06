package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3", f = "TextFieldSelectionManager.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class cha extends p6a implements oh4<r02<? super g2b>, Object> {
    public final /* synthetic */ qga t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cha(qga qgaVar, r02<? super cha> r02Var) {
        super(1, r02Var);
        this.t = qgaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new cha(this.t, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((cha) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.p();
        return g2b.a;
    }
}
