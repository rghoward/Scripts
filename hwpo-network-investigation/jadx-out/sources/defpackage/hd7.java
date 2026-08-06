package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hd7 implements gd7 {
    public static final a Companion = new a();
    public final o7a a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public hd7(Context context) {
        this.a = new o7a(new b10(2, context));
    }

    @Override // defpackage.gd7
    public final g2b a() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.getValue();
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("com.hwpo_training_app.notification_permission.ASKED_PERMISSION_PREVIOUSLY_KEY", true);
        editorEdit.apply();
        return g2b.a;
    }

    @Override // defpackage.gd7
    public final Boolean b() {
        return Boolean.valueOf(((SharedPreferences) this.a.getValue()).getBoolean("com.hwpo_training_app.notification_permission.ASKED_PERMISSION_PREVIOUSLY_KEY", false));
    }
}
