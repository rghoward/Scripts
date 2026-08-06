package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@p87.a("navigation")
public class n67 extends p87<h67> {
    public final r87 c;

    public n67(r87 r87Var) {
        r87Var.getClass();
        this.c = r87Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, android.os.Bundle] */
    @Override // defpackage.p87
    public final void d(List list, k77 k77Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r47 r47Var = (r47) it.next();
            c67 c67Var = r47Var.u;
            c67Var.getClass();
            h67 h67Var = (h67) c67Var;
            f67 f67Var = h67Var.u;
            gl8 gl8Var = new gl8();
            gl8Var.t = r47Var.A.a();
            l67 l67Var = h67Var.y;
            int i = l67Var.c;
            String str = l67Var.e;
            if (i == 0 && str == null) {
                f67Var.getClass();
                String strValueOf = String.valueOf(f67Var.d);
                strValueOf.getClass();
                if (l67Var.a.u.d == 0) {
                    strValueOf = "the root navigation";
                }
                p.a("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            c67 c67VarB = str != null ? l67Var.b(str, false) : l67Var.b.c(i);
            if (c67VarB == null) {
                if (l67Var.d == null) {
                    String strValueOf2 = l67Var.e;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(l67Var.c);
                    }
                    l67Var.d = strValueOf2;
                }
                String str2 = l67Var.d;
                str2.getClass();
                z90.a(sk0.c("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            f67 f67Var2 = c67VarB.u;
            if (str != null) {
                if (!str.equals(f67Var2.e)) {
                    c67.b bVarA = f67Var2.a(str);
                    Bundle bundle = bVarA != null ? bVarA.u : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        ?? C = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                        C.putAll(bundle);
                        Bundle bundle2 = (Bundle) gl8Var.t;
                        if (bundle2 != null) {
                            C.putAll(bundle2);
                        }
                        gl8Var.t = C;
                    }
                }
                if (c67VarB.f().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListG = z63.g(c67VarB.f(), new m67(0, gl8Var));
                    if (!arrayListG.isEmpty()) {
                        v92.c("Cannot navigate to startDestination ", c67VarB, ". Missing required arguments [", arrayListG, 93);
                        return;
                    }
                }
            }
            this.c.b(c67VarB.t).d(ws0.h(b().a(c67VarB, c67VarB.d((Bundle) gl8Var.t))), k77Var);
        }
    }

    @Override // defpackage.p87
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h67 a() {
        return new h67(this);
    }
}
