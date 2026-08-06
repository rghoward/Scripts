package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i67 extends d67<h67> {
    public final r87 g;
    public final String h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i67(r87 r87Var, String str) {
        super(r87Var.b(r87.a.a(n67.class)), null);
        r87Var.getClass();
        str.getClass();
        this.i = new ArrayList();
        this.g = r87Var;
        this.h = str;
    }

    public final h67 c() {
        int iHashCode;
        h67 h67Var = (h67) super.a();
        ArrayList arrayList = this.i;
        arrayList.getClass();
        l67 l67Var = h67Var.y;
        l67Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c67 c67Var = (c67) obj;
            if (c67Var != null) {
                fx9<c67> fx9Var = l67Var.b;
                h67 h67Var2 = l67Var.a;
                f67 f67Var = h67Var2.u;
                f67 f67Var2 = c67Var.u;
                int i2 = f67Var2.d;
                String str = f67Var2.e;
                if (i2 == 0 && str == null) {
                    z90.a("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = f67Var.e;
                if (str2 != null && xj5.a(str, str2)) {
                    p51.d("Destination ", c67Var, " cannot have the same route as graph ", h67Var2);
                    return null;
                }
                if (i2 == f67Var.d) {
                    p51.d("Destination ", c67Var, " cannot have the same id as graph ", h67Var2);
                    return null;
                }
                c67 c67VarC = fx9Var.c(i2);
                if (c67VarC == c67Var) {
                    continue;
                } else {
                    if (c67Var.v != null) {
                        aa0.c("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (c67VarC != null) {
                        c67VarC.v = null;
                    }
                    c67Var.v = h67Var2;
                    fx9Var.e(f67Var2.d, c67Var);
                }
            }
        }
        String str3 = this.h;
        if (str3 == null) {
            if (this.c != null) {
                aa0.c("You must set a start destination route");
                return null;
            }
            aa0.c("You must set a start destination id");
            return null;
        }
        h67 h67Var3 = l67Var.a;
        if (str3 != null) {
            if (str3.equals(h67Var3.u.e)) {
                p51.d("Start destination ", str3, " cannot use the same route as the graph ", h67Var3);
            } else if (z2a.w(str3)) {
                z90.a("Cannot have an empty start destination route");
            } else {
                int i3 = c67.x;
                iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return h67Var;
        }
        iHashCode = 0;
        l67Var.c = iHashCode;
        l67Var.e = str3;
        return h67Var;
    }
}
