package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class twa extends wva {
    public int a0;
    public wva[] d0;
    public ArrayList<wva> Y = new ArrayList<>();
    public boolean Z = true;
    public boolean b0 = false;
    public int c0 = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends pwa {
        public final /* synthetic */ wva a;

        public a(wva wvaVar) {
            this.a = wvaVar;
        }

        @Override // defpackage.pwa, wva.f
        public final void a(wva wvaVar) {
            this.a.E();
            wvaVar.B(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends pwa {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.pwa, wva.f
        public final void l(wva wvaVar) {
            twa twaVar = twa.this;
            twaVar.Y.remove(wvaVar);
            if (twaVar.u()) {
                return;
            }
            twaVar.y(twaVar, wva.g.i, false);
            twaVar.L = true;
            twaVar.y(twaVar, wva.g.h, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends pwa {
        public twa a;

        @Override // defpackage.pwa, wva.f
        public final void a(wva wvaVar) {
            twa twaVar = this.a;
            int i = twaVar.a0 - 1;
            twaVar.a0 = i;
            if (i == 0) {
                twaVar.b0 = false;
                twaVar.n();
            }
            wvaVar.B(this);
        }

        @Override // defpackage.pwa, wva.f
        public final void e(wva wvaVar) {
            twa twaVar = this.a;
            if (twaVar.b0) {
                return;
            }
            twaVar.M();
            twaVar.b0 = true;
        }
    }

    @Override // defpackage.wva
    public final void A() {
        this.R = 0L;
        b bVar = new b();
        for (int i = 0; i < this.Y.size(); i++) {
            wva wvaVar = this.Y.get(i);
            wvaVar.a(bVar);
            wvaVar.A();
            long j = wvaVar.R;
            boolean z = this.Z;
            long j2 = this.R;
            if (z) {
                this.R = Math.max(j2, j);
            } else {
                wvaVar.T = j2;
                this.R = j2 + j;
            }
        }
    }

    @Override // defpackage.wva
    public final wva B(wva.f fVar) {
        super.B(fVar);
        return this;
    }

    @Override // defpackage.wva
    public final void C(View view) {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).C(view);
        }
        this.y.remove(view);
    }

    @Override // defpackage.wva
    public final void D(View view) {
        super.D(view);
        wva[] wvaVarArr = this.d0;
        this.d0 = null;
        if (wvaVarArr == null) {
            wvaVarArr = new wva[this.Y.size()];
        }
        wva[] wvaVarArr2 = (wva[]) this.Y.toArray(wvaVarArr);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            wvaVarArr2[i].D(view);
        }
        Arrays.fill(wvaVarArr2, (Object) null);
        this.d0 = wvaVarArr2;
    }

    @Override // defpackage.wva
    public final void E() {
        ArrayList<wva> arrayList;
        if (this.Y.isEmpty()) {
            M();
            n();
            return;
        }
        c cVar = new c();
        cVar.a = this;
        ArrayList<wva> arrayList2 = this.Y;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            wva wvaVar = arrayList2.get(i2);
            i2++;
            wvaVar.a(cVar);
        }
        this.a0 = this.Y.size();
        if (this.Z) {
            ArrayList<wva> arrayList3 = this.Y;
            int size2 = arrayList3.size();
            while (i < size2) {
                wva wvaVar2 = arrayList3.get(i);
                i++;
                wvaVar2.E();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.Y.size();
            arrayList = this.Y;
            if (i3 >= size3) {
                break;
            }
            arrayList.get(i3 - 1).a(new a(this.Y.get(i3)));
            i3++;
        }
        wva wvaVar3 = arrayList.get(0);
        if (wvaVar3 != null) {
            wvaVar3.E();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.wva
    public final void F(long j, long j2) {
        long j3;
        long j4 = this.R;
        long j5 = 0;
        if (this.C != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.L = false;
            y(this, wva.g.g, z);
        }
        if (!this.Z) {
            int size = 1;
            while (true) {
                int size2 = this.Y.size();
                ArrayList<wva> arrayList = this.Y;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (arrayList.get(size).T > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.Y.size()) {
                        wva wvaVar = this.Y.get(i);
                        long j6 = wvaVar.T;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        wvaVar.F(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    wva wvaVar2 = this.Y.get(i);
                    long j8 = wvaVar2.T;
                    long j9 = j - j8;
                    wvaVar2.F(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.C != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.L = true;
                }
                y(this, wva.g.h, z);
            }
        }
        for (int i2 = 0; i2 < this.Y.size(); i2++) {
            this.Y.get(i2).F(j, j2);
        }
        j3 = j5;
        if (this.C != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.L = true;
            }
            y(this, wva.g.h, z);
        }
    }

    @Override // defpackage.wva
    public final void H(wva.c cVar) {
        this.P = cVar;
        this.c0 |= 8;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).H(cVar);
        }
    }

    @Override // defpackage.wva
    public final void J(ln4 ln4Var) {
        super.J(ln4Var);
        this.c0 |= 4;
        if (this.Y != null) {
            for (int i = 0; i < this.Y.size(); i++) {
                this.Y.get(i).J(ln4Var);
            }
        }
    }

    @Override // defpackage.wva
    public final void K() {
        this.c0 |= 2;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).K();
        }
    }

    @Override // defpackage.wva
    public final void L(long j) {
        this.u = j;
    }

    @Override // defpackage.wva
    public final String N(String str) {
        String strN = super.N(str);
        for (int i = 0; i < this.Y.size(); i++) {
            StringBuilder sbB = tn2.b(strN, "\n");
            sbB.append(this.Y.get(i).N(str.concat("  ")));
            strN = sbB.toString();
        }
        return strN;
    }

    public final void O(wva wvaVar) {
        this.Y.add(wvaVar);
        wvaVar.C = this;
        long j = this.v;
        if (j >= 0) {
            wvaVar.G(j);
        }
        if ((this.c0 & 1) != 0) {
            wvaVar.I(this.w);
        }
        if ((this.c0 & 2) != 0) {
            wvaVar.K();
        }
        if ((this.c0 & 4) != 0) {
            wvaVar.J(this.Q);
        }
        if ((this.c0 & 8) != 0) {
            wvaVar.H(this.P);
        }
    }

    public final wva P(int i) {
        if (i < 0 || i >= this.Y.size()) {
            return null;
        }
        return this.Y.get(i);
    }

    @Override // defpackage.wva
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void G(long j) {
        ArrayList<wva> arrayList;
        this.v = j;
        if (j < 0 || (arrayList = this.Y) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).G(j);
        }
    }

    @Override // defpackage.wva
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void I(TimeInterpolator timeInterpolator) {
        this.c0 |= 1;
        ArrayList<wva> arrayList = this.Y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.Y.get(i).I(timeInterpolator);
            }
        }
        this.w = timeInterpolator;
    }

    public final void S(int i) {
        if (i == 0) {
            this.Z = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(pp2.a(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.Z = false;
        }
    }

    @Override // defpackage.wva
    public final void b(View view) {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).b(view);
        }
        this.y.add(view);
    }

    @Override // defpackage.wva
    public final void cancel() {
        super.cancel();
        wva[] wvaVarArr = this.d0;
        this.d0 = null;
        if (wvaVarArr == null) {
            wvaVarArr = new wva[this.Y.size()];
        }
        wva[] wvaVarArr2 = (wva[]) this.Y.toArray(wvaVarArr);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            wvaVarArr2[i].cancel();
        }
        Arrays.fill(wvaVarArr2, (Object) null);
        this.d0 = wvaVarArr2;
    }

    @Override // defpackage.wva
    public final void d(wwa wwaVar) {
        View view = wwaVar.b;
        if (x(view)) {
            ArrayList<wva> arrayList = this.Y;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                wva wvaVar = arrayList.get(i);
                i++;
                wva wvaVar2 = wvaVar;
                if (wvaVar2.x(view)) {
                    wvaVar2.d(wwaVar);
                    wwaVar.c.add(wvaVar2);
                }
            }
        }
    }

    @Override // defpackage.wva
    public final void f(wwa wwaVar) {
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).f(wwaVar);
        }
    }

    @Override // defpackage.wva
    public final void g(wwa wwaVar) {
        View view = wwaVar.b;
        if (x(view)) {
            ArrayList<wva> arrayList = this.Y;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                wva wvaVar = arrayList.get(i);
                i++;
                wva wvaVar2 = wvaVar;
                if (wvaVar2.x(view)) {
                    wvaVar2.g(wwaVar);
                    wwaVar.c.add(wvaVar2);
                }
            }
        }
    }

    @Override // defpackage.wva
    /* JADX INFO: renamed from: j */
    public final wva clone() {
        twa twaVar = (twa) super.clone();
        twaVar.Y = new ArrayList<>();
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            wva wvaVarClone = this.Y.get(i).clone();
            twaVar.Y.add(wvaVarClone);
            wvaVarClone.C = twaVar;
        }
        return twaVar;
    }

    @Override // defpackage.wva
    public final void m(ViewGroup viewGroup, xwa xwaVar, xwa xwaVar2, ArrayList<wwa> arrayList, ArrayList<wwa> arrayList2) {
        long j = this.u;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            wva wvaVar = this.Y.get(i);
            if (j > 0 && (this.Z || i == 0)) {
                long j2 = wvaVar.u;
                if (j2 > 0) {
                    wvaVar.L(j2 + j);
                } else {
                    wvaVar.L(j);
                }
            }
            wvaVar.m(viewGroup, xwaVar, xwaVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.wva
    public final void o() {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).o();
        }
        super.o();
    }

    @Override // defpackage.wva
    public final boolean u() {
        for (int i = 0; i < this.Y.size(); i++) {
            if (this.Y.get(i).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wva
    public final boolean v() {
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            if (!this.Y.get(i).v()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wva
    public final void z(View view) {
        super.z(view);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).z(view);
        }
    }
}
