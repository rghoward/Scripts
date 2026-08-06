package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n56 implements y18 {
    public a a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        dz9 B(yo yoVar);

        u56 D1();

        qq5 S();

        xv9 getSoftwareKeyboardController();

        lgb getViewConfiguration();

        qga r0();
    }

    @Override // defpackage.y18
    public final void b() {
        xv9 softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    @Override // defpackage.y18
    public final void g() {
        xv9 softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    public abstract void i();

    public final void j(h56 h56Var) {
        if (this.a != h56Var) {
            xc5.c("Expected textInputModifierNode to be " + h56Var + " but was " + this.a);
        }
        this.a = null;
    }
}
