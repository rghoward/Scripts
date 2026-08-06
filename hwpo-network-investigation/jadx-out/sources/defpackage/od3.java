package defpackage;

import android.graphics.Color;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class od3 implements jac {
    public static final /* synthetic */ od3 t = new od3();

    public static k5a b() {
        return new k5a(null);
    }

    public static void c(AppCompatEditText appCompatEditText, boolean z, int i, oh4 oh4Var, int i2) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        appCompatEditText.addTextChangedListener(new pu3(z, oh4Var, z, appCompatEditText, i));
    }

    public static final vi4 d(vi4 vi4Var) {
        if (!(vi4Var instanceof vi4)) {
            vi4Var = null;
        }
        if (vi4Var != null) {
            return vi4Var;
        }
        pt1.b("Inconsistent composition");
        fl.a();
        return null;
    }

    public static boolean e(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static String f(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = n6b.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((y6c) x6c.u.t.t).a());
    }
}
