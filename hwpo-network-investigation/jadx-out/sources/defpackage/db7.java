package defpackage;

import android.view.KeyEvent;
import io.ably.lib.http.HttpConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class db7 {
    public static final db7 a = new db7();

    public static final long a(KeyEvent keyEvent) {
        return ds6.b(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean c(String str) {
        str.getClass();
        return str.equals(HttpConstants.Methods.POST) || str.equals(HttpConstants.Methods.PATCH) || str.equals(HttpConstants.Methods.PUT) || str.equals(HttpConstants.Methods.DELETE) || str.equals("MOVE");
    }

    public static final boolean d(String str) {
        str.getClass();
        return (str.equals(HttpConstants.Methods.GET) || str.equals("HEAD")) ? false : true;
    }
}
