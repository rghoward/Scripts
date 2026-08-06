package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.fragment.app.a;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import androidx.fragment.app.l.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class y10 {
    public final g a;
    public final int b;
    public final l c;
    public final i d;
    public final ArrayList e;

    public y10(g gVar, int i, l lVar) {
        i iVarJ = lVar.J();
        iVarJ.getClass();
        this.a = gVar;
        this.b = i;
        this.c = lVar;
        this.d = iVarJ;
        this.e = new ArrayList();
    }

    public void a(lj1 lj1Var) {
        lj1Var.getClass();
        boolean z = lj1Var instanceof kd4;
        g gVar = this.a;
        if (z) {
            z59 z59Var = ((kd4) lj1Var).a;
            if (!(z59Var instanceof oa)) {
                if (z59Var instanceof sf4) {
                    c((sf4) z59Var, true);
                    return;
                }
                return;
            } else {
                oa oaVar = (oa) z59Var;
                Intent intentC = oaVar.c();
                try {
                    gVar.startActivity(intentC, oaVar.d());
                    return;
                } catch (ActivityNotFoundException unused) {
                    intentC.getClass();
                    return;
                }
            }
        }
        boolean z2 = lj1Var instanceof tn8;
        l lVar = this.c;
        ArrayList arrayList = this.e;
        if (z2) {
            z59 z59Var2 = ((tn8) lj1Var).a;
            if (z59Var2 instanceof oa) {
                oa oaVar2 = (oa) z59Var2;
                Intent intentC2 = oaVar2.c();
                try {
                    gVar.startActivity(intentC2, oaVar2.d());
                } catch (ActivityNotFoundException unused2) {
                    intentC2.getClass();
                }
                gVar.finish();
                return;
            }
            if (z59Var2 instanceof sf4) {
                if (arrayList.isEmpty()) {
                    c((sf4) z59Var2, false);
                    return;
                }
                lVar.getClass();
                lVar.y(lVar.new r(null, -1, 0), false);
                arrayList.remove(arrayList.size() - 1);
                c((sf4) z59Var2, true);
                return;
            }
            return;
        }
        if (!(lj1Var instanceof xh0)) {
            if (lj1Var instanceof eh0) {
                if (arrayList.isEmpty()) {
                    gVar.finish();
                    return;
                }
                lVar.getClass();
                lVar.y(lVar.new r(null, -1, 0), false);
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            return;
        }
        z59 z59Var3 = ((xh0) lj1Var).a;
        if (z59Var3 == null) {
            arrayList.clear();
            lVar.getClass();
            lVar.y(lVar.new r(null, -1, 1), false);
            return;
        }
        String strE = z59Var3.e();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (xj5.a((String) obj, strE)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            arrayList.clear();
            lVar.getClass();
            lVar.y(lVar.new r(null, -1, 1), false);
        } else {
            List listSubList = arrayList.subList(i, arrayList.size());
            String string = ((String) th1.y(listSubList)).toString();
            lVar.getClass();
            lVar.y(lVar.new r(string, -1, 0), false);
            listSubList.clear();
        }
    }

    public final void b(lj1[] lj1VarArr) {
        a aVar;
        lj1VarArr.getClass();
        l lVar = this.c;
        lVar.A(true);
        lVar.F();
        ArrayList arrayList = this.e;
        arrayList.clear();
        int iH = lVar.H();
        int i = 0;
        if (iH > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 == lVar.d.size()) {
                    aVar = lVar.h;
                    if (aVar == null) {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    aVar = lVar.d.get(i2);
                }
                String name = aVar.getName();
                name.getClass();
                arrayList.add(name);
                if (i3 >= iH) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        int length = lj1VarArr.length;
        while (i < length) {
            lj1 lj1Var = lj1VarArr[i];
            i++;
            try {
                a(lj1Var);
            } catch (RuntimeException e) {
                lj1Var.getClass();
                throw e;
            }
        }
    }

    public final void c(sf4 sf4Var, boolean z) {
        sf4Var.getClass();
        f fVarA = sf4Var.a(this.d);
        l lVar = this.c;
        lVar.getClass();
        a aVar = new a(lVar);
        aVar.p = true;
        int i = this.b;
        lVar.D(i);
        d(sf4Var, aVar, fVarA);
        if (sf4Var.b()) {
            String strE = sf4Var.e();
            if (i == 0) {
                z90.a("Must use non-zero containerViewId");
                return;
            }
            aVar.d(i, fVarA, strE, 2);
        } else {
            aVar.d(i, fVarA, sf4Var.e(), 1);
        }
        if (z) {
            String strE2 = sf4Var.e();
            if (!aVar.h) {
                aa0.c("This FragmentTransaction is not allowed to be added to the back stack.");
                return;
            } else {
                aVar.g = true;
                aVar.i = strE2;
                this.e.add(sf4Var.e());
            }
        }
        aVar.h(false, true);
    }

    public void d(sf4 sf4Var, a aVar, f fVar) {
        sf4Var.getClass();
        fVar.getClass();
    }
}
