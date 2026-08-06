package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f67 {
    public final c67 a;
    public final ArrayList b = new ArrayList();
    public final LinkedHashMap c = new LinkedHashMap();
    public int d;
    public String e;
    public o7a f;

    public f67(c67 c67Var) {
        this.a = c67Var;
    }

    public final c67.b a(String str) {
        x57 x57Var;
        str.getClass();
        o7a o7aVar = this.f;
        if (o7aVar == null || (x57Var = (x57) o7aVar.getValue()) == null) {
            return null;
        }
        int i = c67.x;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = x57Var.d(uri, this.c);
        if (bundleD == null) {
            return null;
        }
        return new c67.b(this.a, bundleD, x57Var.l, x57Var.b(uri), false, -1);
    }
}
