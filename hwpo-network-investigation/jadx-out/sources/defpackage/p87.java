package defpackage;

import defpackage.c67;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p87<D extends c67> {
    public g57.a a;
    public boolean b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String value();
    }

    public abstract D a();

    public final s87 b() {
        g57.a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        aa0.c("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, final k77 k77Var) {
        oz3.a aVar = new oz3.a(new oz3(new pva(new sh1(list), new oh4(k77Var) { // from class: o87
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                r47 r47Var = (r47) obj;
                r47Var.getClass();
                u47 u47Var = r47Var.A;
                c67 c67Var = r47Var.u;
                if (c67Var == null) {
                    c67Var = null;
                }
                if (c67Var != null) {
                    u47Var.a();
                    p87 p87Var = this.t;
                    c67 c67VarC = p87Var.c(c67Var);
                    if (c67VarC != null) {
                        return c67VarC.equals(c67Var) ? r47Var : p87Var.b().a(c67VarC, c67VarC.d(u47Var.a()));
                    }
                }
                return null;
            }
        }), false, new fd9()));
        while (aVar.hasNext()) {
            b().f((r47) aVar.next());
        }
    }

    public void e(r47 r47Var, boolean z) {
        List list = (List) b().e.t.getValue();
        if (!list.contains(r47Var)) {
            n87.b("popBackStack was called with ", r47Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        r47 r47Var2 = null;
        while (f()) {
            r47Var2 = (r47) listIterator.previous();
            if (xj5.a(r47Var2, r47Var)) {
                break;
            }
        }
        if (r47Var2 != null) {
            b().c(r47Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public c67 c(c67 c67Var) {
        return c67Var;
    }
}
