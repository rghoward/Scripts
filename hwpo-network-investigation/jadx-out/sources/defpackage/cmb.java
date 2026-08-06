package defpackage;

import com.intercom.twig.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cmb {
    public static int f;
    public ArrayList<vx1> a;
    public int b;
    public int c;
    public ArrayList<a> d;
    public int e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
    }

    public final void a(ArrayList<cmb> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                cmb cmbVar = arrayList.get(i);
                if (this.e == cmbVar.b) {
                    c(this.c, cmbVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(j86 j86Var, int i) {
        int iN;
        int iN2;
        ArrayList<vx1> arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        wx1 wx1Var = (wx1) arrayList.get(0).V;
        j86Var.t();
        wx1Var.b(j86Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).b(j86Var, false);
        }
        if (i == 0 && wx1Var.A0 > 0) {
            d61.a(wx1Var, j86Var, arrayList, 0);
        }
        if (i == 1 && wx1Var.B0 > 0) {
            d61.a(wx1Var, j86Var, arrayList, 1);
        }
        try {
            j86Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", BuildConfig.FLAVOR));
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            vx1 vx1Var = arrayList.get(i3);
            a aVar = new a();
            new WeakReference(vx1Var);
            j86.n(vx1Var.J);
            j86.n(vx1Var.K);
            j86.n(vx1Var.L);
            j86.n(vx1Var.M);
            j86.n(vx1Var.N);
            this.d.add(aVar);
        }
        if (i == 0) {
            iN = j86.n(wx1Var.J);
            iN2 = j86.n(wx1Var.L);
            j86Var.t();
        } else {
            iN = j86.n(wx1Var.K);
            iN2 = j86.n(wx1Var.M);
            j86Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, cmb cmbVar) {
        int i2 = cmbVar.b;
        ArrayList<vx1> arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            vx1 vx1Var = arrayList.get(i3);
            i3++;
            vx1 vx1Var2 = vx1Var;
            ArrayList<vx1> arrayList2 = cmbVar.a;
            if (!arrayList2.contains(vx1Var2)) {
                arrayList2.add(vx1Var2);
            }
            if (i == 0) {
                vx1Var2.p0 = i2;
            } else {
                vx1Var2.q0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strB = i34.b(this.b, "] <", sb);
        ArrayList<vx1> arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            vx1 vx1Var = arrayList.get(i2);
            i2++;
            StringBuilder sbB = tn2.b(strB, " ");
            sbB.append(vx1Var.j0);
            strB = sbB.toString();
        }
        return strB.concat(" >");
    }
}
