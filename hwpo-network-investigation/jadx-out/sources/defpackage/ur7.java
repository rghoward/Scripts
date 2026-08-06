package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ur7<T> {
    public final h72 a;
    public sy4 b;
    public n1b c;
    public mp7<T> d;
    public final y17 e;
    public final j52 f;
    public final kq9 g;
    public volatile boolean h;
    public volatile int i;
    public final a0a j;
    public final li8 k;
    public final am9 l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements n1b {
        public boolean a;
        public boolean b;

        @Override // defpackage.n1b
        public final void a() {
            this.b = true;
        }

        @Override // defpackage.n1b
        public final void c() {
            this.a = true;
        }
    }

    public ur7(h72 h72Var, sr7<T> sr7Var) {
        mp7<T> mp7Var;
        oo7.b<T> bVarInvoke;
        h72Var.getClass();
        this.a = h72Var;
        this.c = new a();
        mp7<Object> mp7Var2 = mp7.e;
        oo7.b<T> bVarInvoke2 = sr7Var != null ? sr7Var.d.invoke() : null;
        if (bVarInvoke2 != null) {
            mp7Var = new mp7<>(bVarInvoke2);
        } else {
            mp7Var = (mp7<T>) mp7.e;
            mp7Var.getClass();
        }
        this.d = mp7Var;
        y17 y17Var = new y17();
        if (sr7Var != null && (bVarInvoke = sr7Var.d.invoke()) != null) {
            y17Var.b(bVarInvoke.e, bVarInvoke.f);
        }
        this.e = y17Var;
        j52 j52Var = new j52();
        this.f = j52Var;
        this.g = new kq9();
        this.j = b0a.b(Boolean.FALSE);
        this.k = y17Var.c;
        this.l = ty1.a(0, 64, xx0.u);
        ((CopyOnWriteArrayList) j52Var.u).add(new q15(2, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    public static final Object a(ur7 ur7Var, List list, int i, int i2, boolean z, vb6 vb6Var, vb6 vb6Var2, sy4 sy4Var, u02 u02Var) throws Throwable {
        xr7 xr7Var;
        mp7<T> mp7Var;
        sy4 sy4Var2;
        List list2;
        boolean z2;
        vb6 vb6Var3;
        sy4 sy4Var3;
        mp7<T> mp7Var2;
        vb6 vb6Var4;
        sy4 sy4Var4;
        List<T> list3;
        List<T> list4;
        ur7 ur7Var2 = ur7Var;
        int i3 = i;
        int i4 = i2;
        ur7Var2.getClass();
        if (u02Var instanceof xr7) {
            xr7Var = (xr7) u02Var;
            int i5 = xr7Var.F;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                xr7Var.F = i5 - Integer.MIN_VALUE;
            } else {
                xr7Var = new xr7(ur7Var2, u02Var);
            }
        } else {
            xr7Var = new xr7(ur7Var2, u02Var);
        }
        Object obj = xr7Var.D;
        v72 v72Var = v72.t;
        int i6 = xr7Var.F;
        if (i6 == 0) {
            dv8.b(obj);
            if (z && vb6Var == null) {
                z90.a("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                return null;
            }
            ur7Var2.h = false;
            mp7<T> mp7Var3 = ur7Var2.d;
            sy4 sy4Var5 = ur7Var2.b;
            mp7<T> mp7Var4 = new mp7<>(i3, i4, list);
            mp7<T> mp7Var5 = ur7Var2.d;
            mp7Var5.getClass();
            ur7Var2.d = mp7Var4;
            ur7Var2.b = sy4Var;
            try {
                new tr7.e(mp7Var4, mp7Var5);
                xr7Var.t = list;
                xr7Var.u = vb6Var;
                xr7Var.v = vb6Var2;
                xr7Var.w = sy4Var;
                xr7Var.x = mp7Var3;
                xr7Var.y = sy4Var5;
                xr7Var.z = mp7Var4;
                xr7Var.A = i3;
                xr7Var.B = i4;
                xr7Var.C = z;
                xr7Var.F = 1;
                if (ur7Var.b() == v72Var) {
                    return v72Var;
                }
                list2 = list;
                z2 = z;
                vb6Var3 = vb6Var;
                sy4Var3 = sy4Var;
                mp7Var = mp7Var3;
                sy4Var2 = sy4Var5;
                mp7Var2 = mp7Var4;
                vb6Var4 = vb6Var2;
            } catch (CancellationException e) {
                e = e;
                ur7Var2 = ur7Var;
                mp7Var = mp7Var3;
                sy4Var2 = sy4Var5;
                ur7Var2.d = mp7Var;
                ur7Var2.b = sy4Var2;
                throw e;
            }
        } else {
            if (i6 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = xr7Var.C;
            int i7 = xr7Var.B;
            int i8 = xr7Var.A;
            mp7Var2 = xr7Var.z;
            sy4Var2 = xr7Var.y;
            mp7Var = xr7Var.x;
            sy4Var3 = xr7Var.w;
            vb6Var4 = xr7Var.v;
            vb6Var3 = xr7Var.u;
            list2 = xr7Var.t;
            try {
                dv8.b(obj);
                i4 = i7;
                i3 = i8;
            } catch (CancellationException e2) {
                e = e2;
                ur7Var2.d = mp7Var;
                ur7Var2.b = sy4Var2;
                throw e;
            }
        }
        try {
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                StringBuilder sb = new StringBuilder("Presenting data (\n                            |   first item: ");
                cva cvaVar = (cva) th1.A(list2);
                sb.append((cvaVar == null || (list4 = cvaVar.b) == null) ? null : th1.A(list4));
                sb.append("\n                            |   last item: ");
                cva cvaVar2 = (cva) th1.H(list2);
                sb.append((cvaVar2 == null || (list3 = cvaVar2.b) == null) ? null : th1.H(list3));
                sb.append("\n                            |   placeholdersBefore: ");
                sb.append(i3);
                sb.append("\n                            |   placeholdersAfter: ");
                sb.append(i4);
                sb.append("\n                            |   hintReceiver: ");
                sb.append(sy4Var3);
                sb.append("\n                            |   sourceLoadStates: ");
                sb.append(vb6Var3);
                sb.append("\n                        ");
                String string = sb.toString();
                if (vb6Var4 != null) {
                    string = string + "|   mediatorLoadStates: " + vb6Var4 + '\n';
                }
                Log.d("Paging", s2a.c(string.concat("|)")), null);
            }
            if (z2) {
                ur7Var2 = ur7Var;
                y17 y17Var = ur7Var2.e;
                vb6Var3.getClass();
                y17Var.b(vb6Var3, vb6Var4);
            } else {
                ur7Var2 = ur7Var;
            }
            if (mp7Var2.getSize() == 0 && (sy4Var4 = ur7Var2.b) != null) {
                int i9 = mp7Var2.b / 2;
                Integer numC = u30.C(((cva) th1.y(mp7Var2.a)).a);
                numC.getClass();
                sy4Var4.a(new hjb.b(i9, i9, numC.intValue(), mp7Var2.f()));
            }
            return g2b.a;
        } catch (CancellationException e3) {
            e = e3;
            ur7Var2 = ur7Var;
            ur7Var2.d = mp7Var;
            ur7Var2.b = sy4Var2;
            throw e;
        }
    }

    public abstract g2b b();

    public final qk5<T> c() {
        mp7<T> mp7Var = this.d;
        int i = mp7Var.c;
        int i2 = mp7Var.d;
        ArrayList arrayList = mp7Var.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            rh1.o(((cva) obj).b, arrayList2);
        }
        return new qk5<>(arrayList2, i, i2);
    }
}
