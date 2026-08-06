package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mm8 implements jac {
    public static final /* synthetic */ mm8 t = new mm8();

    public static final String b(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final h37 c(Object[] objArr, i19 i19Var, mh4 mh4Var, jt1 jt1Var, int i) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        i19Var.getClass();
        return (h37) f(objArrCopyOf, new au3(new km8(0, i19Var), new hr4(1, i19Var)), mh4Var, jt1Var, ((i << 3) & 7168) | 384, 0);
    }

    public static final Object d(Object[] objArr, mh4 mh4Var, jt1 jt1Var, int i) {
        return f(Arrays.copyOf(objArr, objArr.length), hu1.u, mh4Var, jt1Var, ((i << 6) & 7168) | 384, 0);
    }

    public static final Object e(Object[] objArr, i19 i19Var, mh4 mh4Var, jt1 jt1Var, int i) {
        return f(Arrays.copyOf(objArr, objArr.length), i19Var, mh4Var, jt1Var, 384 | ((i << 3) & 7168), 0);
    }

    @gy2
    public static final Object f(Object[] objArr, i19 i19Var, mh4 mh4Var, jt1 jt1Var, int i, int i2) {
        Object[] objArr2;
        i19 i19Var2;
        final Object obj;
        Object objD;
        long jV = jt1Var.v();
        ta1.a(36);
        final String string = Long.toString(jV, 36);
        string.getClass();
        i19Var.getClass();
        final m09 m09Var = (m09) jt1Var.F(o09.a);
        Object objF = jt1Var.f();
        Object obj2 = jt1.a.a;
        if (objF == obj2) {
            Object objA = (m09Var == null || (objD = m09Var.d(string)) == null) ? null : i19Var.a(objD);
            if (objA == null) {
                objA = mh4Var.invoke();
            }
            objArr2 = objArr;
            i19Var2 = i19Var;
            Object e09Var = new e09(i19Var2, m09Var, string, objA, objArr2);
            jt1Var.C(e09Var);
            objF = e09Var;
        } else {
            objArr2 = objArr;
            i19Var2 = i19Var;
        }
        final e09 e09Var2 = (e09) objF;
        Object objInvoke = Arrays.equals(objArr2, e09Var2.x) ? e09Var2.w : null;
        if (objInvoke == null) {
            objInvoke = mh4Var.invoke();
        }
        boolean zJ = jt1Var.j(e09Var2) | ((((i & 112) ^ 48) > 32 && jt1Var.j(i19Var2)) || (i & 48) == 32) | jt1Var.j(m09Var) | jt1Var.J(string) | jt1Var.j(objInvoke) | jt1Var.j(objArr2);
        Object objF2 = jt1Var.f();
        if (zJ || objF2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            final i19 i19Var3 = i19Var2;
            Object obj3 = new mh4() { // from class: lm8
                /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
                @Override // defpackage.mh4
                public final Object invoke() {
                    boolean z;
                    e09 e09Var3 = e09Var2;
                    m09 m09Var2 = e09Var3.u;
                    m09 m09Var3 = m09Var;
                    boolean z2 = true;
                    if (m09Var2 != m09Var3) {
                        e09Var3.u = m09Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = e09Var3.v;
                    String str2 = string;
                    if (xj5.a(str, str2)) {
                        z2 = z;
                    } else {
                        e09Var3.v = str2;
                    }
                    e09Var3.t = i19Var3;
                    e09Var3.w = obj;
                    e09Var3.x = objArr3;
                    m09.a aVar = e09Var3.y;
                    if (aVar != null && z2) {
                        aVar.a();
                        e09Var3.y = null;
                        e09Var3.e();
                    }
                    return g2b.a;
                }
            };
            jt1Var.C(obj3);
            objF2 = obj3;
        } else {
            obj = objInvoke;
        }
        c33 c33Var = wd3.a;
        jt1Var.w((mh4) objF2);
        return obj;
    }

    public static final bd8 g(zc8 zc8Var) {
        return new bd8(zc8Var.t, zc8Var.u, zc8Var.A, zc8Var.C, zc8Var.w, zc8Var.v, zc8Var.x, zc8Var.y, h(zc8Var.z), zc8Var.D);
    }

    public static final w59 h(dd8 dd8Var) {
        dd8Var.getClass();
        int i = dd8Var.t;
        int i2 = dd8Var.x;
        int i3 = dd8Var.y;
        double d = dd8Var.u;
        boolean z = dd8Var.A;
        int i4 = dd8Var.z;
        List<dd8> list = dd8Var.w;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((dd8) it.next()));
        }
        return new w59(i, i2, i3, d, z, i4, arrayList, dd8Var.B, dd8Var.C);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return u4c.u.get().e();
    }
}
