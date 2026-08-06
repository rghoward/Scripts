package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ws0 implements jac {
    public static final /* synthetic */ ws0 t = new ws0();

    public static final vs0 b(float f, long j) {
        return new vs0(f, new aw9(j));
    }

    public static ArrayList c(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new f30(objArr, true));
    }

    public static int d(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        l(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iF = eo7.f((Comparable) arrayList.get(i3), comparable);
            if (iF < 0) {
                i2 = i3 + 1;
            } else {
                if (iF <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static e96 e(e96 e96Var) {
        e96Var.k();
        e96Var.v = true;
        return e96Var.u > 0 ? e96Var : e96.w;
    }

    public static e96 f() {
        return new e96(10);
    }

    public static int g(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List h(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List i(Object... objArr) {
        if (objArr.length <= 0) {
            return hf3.t;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList j(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new f30(objArr, true));
    }

    public static final List k(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : h(list.get(0));
        }
        return hf3.t;
    }

    public static final void l(int i, int i2) {
        if (i2 < 0) {
            z90.a(pk.d(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            r.b(a30.b("toIndex (", ") is greater than size (", ").", i2, i));
        }
    }

    public static void m() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().z());
    }
}
