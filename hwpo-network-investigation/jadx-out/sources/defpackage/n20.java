package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.f;
import androidx.fragment.app.l;
import androidx.fragment.app.l.r;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n20 extends y10 {
    @Override // defpackage.y10
    public final void a(lj1 lj1Var) {
        lj1Var.getClass();
        boolean z = lj1Var instanceof yh0;
        l lVar = this.c;
        ArrayList arrayList = this.e;
        if (z) {
            rf4 rf4Var = ((yh0) lj1Var).a;
            String str = rf4Var.a;
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
                if (xj5.a((String) obj, str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                super.a(new kd4(rf4Var));
                return;
            }
            List listSubList = arrayList.subList(i, arrayList.size());
            String string = ((String) th1.y(listSubList)).toString();
            lVar.getClass();
            lVar.y(lVar.new r(string, -1, 0), false);
            listSubList.clear();
            return;
        }
        if (!(lj1Var instanceof vn8)) {
            super.a(lj1Var);
            return;
        }
        if (arrayList.isEmpty()) {
            c(((vn8) lj1Var).a, false);
            return;
        }
        lVar.getClass();
        a aVar = new a(lVar);
        aVar.p = true;
        for (int i3 = 0; i3 < 2; i3++) {
            lVar.y(lVar.new r(null, -1, 0), false);
            arrayList.remove(arrayList.size() - 1);
        }
        rf4 rf4Var2 = ((vn8) lj1Var).a;
        String str2 = rf4Var2.a;
        f fVarA = rf4Var2.a(this.d);
        int i4 = this.b;
        if (i4 == 0) {
            z90.a("Must use non-zero containerViewId");
            return;
        }
        aVar.d(i4, fVarA, str2, 2);
        if (!aVar.h) {
            aa0.c("This FragmentTransaction is not allowed to be added to the back stack.");
            return;
        }
        aVar.g = true;
        aVar.i = str2;
        arrayList.add(str2);
        aVar.h(false, true);
    }

    @Override // defpackage.y10
    public final void d(sf4 sf4Var, a aVar, f fVar) {
        sf4Var.getClass();
        fVar.getClass();
        if (fVar instanceof rv) {
            return;
        }
        aVar.b = R.anim.slide_from_right;
        aVar.c = R.anim.slide_to_left;
        aVar.d = R.anim.slide_from_left;
        aVar.e = R.anim.slide_to_right;
    }
}
