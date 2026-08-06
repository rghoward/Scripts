package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class h67 extends c67 implements Iterable<c67>, zn5 {
    public static final /* synthetic */ int z = 0;
    public final l67 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static c67 a(h67 h67Var) {
            Iterator it = ed9.d(h67Var, new g67(0)).iterator();
            if (!it.hasNext()) {
                px1.b("Sequence is empty.");
                return null;
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (c67) next;
        }
    }

    public h67(n67 n67Var) {
        super(n67Var);
        this.y = new l67(this);
    }

    @Override // defpackage.c67
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h67) || !super.equals(obj)) {
            return false;
        }
        l67 l67Var = this.y;
        int iF = l67Var.b.f();
        l67 l67Var2 = ((h67) obj).y;
        if (iF != l67Var2.b.f() || l67Var.c != l67Var2.c) {
            return false;
        }
        fx9<c67> fx9Var = l67Var.b;
        fx9Var.getClass();
        for (c67 c67Var : (rx1) ed9.c(new hx9(fx9Var))) {
            if (!c67Var.equals(l67Var2.b.c(c67Var.u.d))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.c67
    public final int hashCode() {
        l67 l67Var = this.y;
        int iD = l67Var.c;
        fx9<c67> fx9Var = l67Var.b;
        int iF = fx9Var.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + fx9Var.d(i)) * 31) + fx9Var.g(i).hashCode();
        }
        return iD;
    }

    @Override // defpackage.c67
    public final c67.b i(b67 b67Var) {
        c67.b bVarI = super.i(b67Var);
        l67 l67Var = this.y;
        l67Var.getClass();
        return l67Var.d(bVarI, b67Var, false, l67Var.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<c67> iterator() {
        l67 l67Var = this.y;
        l67Var.getClass();
        return new k67(l67Var);
    }

    public final c67.b j(b67 b67Var, c67 c67Var) {
        return this.y.d(super.i(b67Var), b67Var, true, c67Var);
    }

    public final c67.b k(String str, boolean z2, c67 c67Var) {
        c67.b bVarK;
        str.getClass();
        l67 l67Var = this.y;
        l67Var.getClass();
        h67 h67Var = l67Var.a;
        c67.b bVarA = h67Var.u.a(str);
        ArrayList arrayList = new ArrayList();
        Iterator<c67> it = h67Var.iterator();
        while (true) {
            k67 k67Var = (k67) it;
            bVarK = null;
            if (!k67Var.hasNext()) {
                break;
            }
            c67 c67Var2 = (c67) k67Var.next();
            if (!xj5.a(c67Var2, c67Var)) {
                if (c67Var2 instanceof h67) {
                    bVarK = ((h67) c67Var2).k(str, false, h67Var);
                } else {
                    c67Var2.getClass();
                    bVarK = c67Var2.u.a(str);
                }
            }
            if (bVarK != null) {
                arrayList.add(bVarK);
            }
        }
        c67.b bVar = (c67.b) th1.I(arrayList);
        h67 h67Var2 = h67Var.v;
        if (h67Var2 != null && z2 && !h67Var2.equals(c67Var)) {
            bVarK = h67Var2.k(str, true, h67Var);
        }
        return (c67.b) th1.I(u30.v(new c67.b[]{bVarA, bVar, bVarK}));
    }

    @Override // defpackage.c67
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        l67 l67Var = this.y;
        String str = l67Var.e;
        l67Var.getClass();
        c67 c67VarB = (str == null || z2a.w(str)) ? null : l67Var.b(str, true);
        if (c67VarB == null) {
            c67VarB = l67Var.a(l67Var.c);
        }
        sb.append(" startDestination=");
        if (c67VarB == null) {
            String str2 = l67Var.e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = l67Var.d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(l67Var.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(c67VarB.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
