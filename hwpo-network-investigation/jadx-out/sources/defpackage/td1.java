package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class td1 {
    public final String a;
    public List<? extends Annotation> b = hf3.t;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public td1(String str) {
        this.a = str;
    }

    public static void a(td1 td1Var, String str, SerialDescriptor serialDescriptor) {
        td1Var.getClass();
        str.getClass();
        serialDescriptor.getClass();
        if (!td1Var.d.add(str)) {
            StringBuilder sbA = aa.a("Element with name '", str, "' is already registered in ");
            sbA.append(td1Var.a);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        td1Var.c.add(str);
        td1Var.e.add(serialDescriptor);
        td1Var.f.add(hf3.t);
        td1Var.g.add(false);
    }
}
