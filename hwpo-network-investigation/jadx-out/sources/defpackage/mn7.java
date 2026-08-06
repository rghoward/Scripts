package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface mn7 extends n68 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void b();
    }

    void A();

    void B(qr5 qr5Var, boolean z);

    void C(qr5 qr5Var);

    void D(qr5 qr5Var, boolean z, boolean z2, boolean z3);

    void F(qr5 qr5Var);

    void G(qr5 qr5Var);

    void I();

    void K(qr5 qr5Var, boolean z, boolean z2);

    void a(boolean z);

    void c(qr5 qr5Var, long j);

    long d(long j);

    long e(long j);

    void g(qr5 qr5Var);

    u3 getAccessibilityManager();

    ff0 getAutofill();

    of0 getAutofillManager();

    qf0 getAutofillTree();

    pf1 getClipboard();

    qf1 getClipboardManager();

    h72 getCoroutineContext();

    tx2 getDensity();

    f53 getDragAndDropManager();

    g94 getFocusOwner();

    qa4.a getFontFamilyResolver();

    pa4 getFontLoader();

    jo4 getGraphicsContext();

    st4 getHapticFeedBack();

    rd5 getInputModeManager();

    tq5 getLayoutDirection();

    ad6 getLocaleList();

    rx6 getModifierLocalManager();

    default bm7 getOutOfFrameExecutor() {
        return null;
    }

    default jz7.a getPlacementScope() {
        int i = kz7.b;
        return new cm7(this);
    }

    x48 getPointerIconService();

    xk8 getRectManager();

    lv8 getRetainedValuesStore();

    qr5 getRoot();

    yb9 getSemanticsOwner();

    tr5 getSharedDrawScope();

    boolean getShowLayoutBounds();

    un7 getSnapshotObserver();

    xv9 getSoftwareKeyboardController();

    xha getTextInputService();

    xja getTextToolbar();

    lgb getViewConfiguration();

    mmb getWindowInfo();

    void i(qi0.b bVar);

    void l(qr5 qr5Var);

    void m(mh4<g2b> mh4Var);

    void p(qr5 qr5Var);

    void q(ci4 ci4Var, u02 u02Var);

    void s(qr5 qr5Var);

    void setShowLayoutBounds(boolean z);

    ln7 w(ci4 ci4Var, mb7.f fVar, ko4 ko4Var);

    void y();

    default void J() {
    }

    default void n() {
    }

    default void k(float f) {
    }

    default void o(int i, qr5 qr5Var) {
    }

    default void x(int i, qr5 qr5Var) {
    }
}
