package defpackage;

import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class je3 {
    public final a a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends b {
        public final EditText a;
        public final ye3 b;

        public a(EditText editText) {
            this.a = editText;
            ye3 ye3Var = new ye3(editText);
            this.b = ye3Var;
            editText.addTextChangedListener(ye3Var);
            if (ke3.b == null) {
                synchronized (ke3.a) {
                    try {
                        if (ke3.b == null) {
                            ke3 ke3Var = new ke3();
                            try {
                                ke3.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ke3.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            ke3.b = ke3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            editText.setEditableFactory(ke3.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
    }

    public je3(EditText editText) {
        this.a = new a(editText);
    }
}
