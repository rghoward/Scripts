package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class g57 {
    public final Context a;
    public final q57 b;
    public final c57 c;
    public final Activity d;
    public boolean e;
    public final c f;
    public final boolean g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends s87 {
        public final p87<? extends c67> g;
        public final /* synthetic */ g57 h;

        public a(g57 g57Var, p87<? extends c67> p87Var) {
            p87Var.getClass();
            this.h = g57Var;
            this.g = p87Var;
        }

        @Override // defpackage.s87
        public final r47 a(c67 c67Var, Bundle bundle) {
            q57 q57Var = this.h.b;
            q57Var.getClass();
            return r47.a.a(q57Var.a.c, c67Var, bundle, q57Var.i(), q57Var.o);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        @Override // defpackage.s87
        public final void b(r47 r47Var) {
            r57 r57Var;
            vhb vhbVar;
            r47Var.getClass();
            q57 q57Var = this.h.b;
            a0a a0aVar = q57Var.h;
            String str = r47Var.y;
            LinkedHashMap linkedHashMap = q57Var.w;
            boolean zA = xj5.a(linkedHashMap.get(r47Var), Boolean.TRUE);
            super.b(r47Var);
            g2b g2bVar = g2b.a;
            linkedHashMap.remove(r47Var);
            h30<r47> h30Var = q57Var.f;
            if (h30Var.contains(r47Var)) {
                if (this.d) {
                    return;
                }
                q57Var.t();
                a0a a0aVar2 = q57Var.g;
                ArrayList arrayList = new ArrayList(h30Var);
                a0aVar2.getClass();
                a0aVar2.l(null, arrayList);
                ArrayList arrayListQ = q57Var.q();
                a0aVar.getClass();
                a0aVar.l(null, arrayListQ);
                return;
            }
            q57Var.s(r47Var);
            if (r47Var.A.j.d.compareTo(s66.b.v) >= 0) {
                r47Var.a(s66.b.t);
            }
            if (!h30Var.isEmpty()) {
                Iterator<r47> it = h30Var.iterator();
                while (it.hasNext()) {
                    if (xj5.a(it.next().y, str)) {
                    }
                }
                if (!zA) {
                    str.getClass();
                    vhbVar = (vhb) r57Var.t.remove(str);
                    if (vhbVar != null) {
                        vhbVar.a();
                    }
                }
            } else if (!zA && (r57Var = q57Var.o) != null) {
                str.getClass();
                vhbVar = (vhb) r57Var.t.remove(str);
                if (vhbVar != null) {
                    vhbVar.a();
                }
            }
            q57Var.t();
            ArrayList arrayListQ2 = q57Var.q();
            a0aVar.getClass();
            a0aVar.l(null, arrayListQ2);
        }

        @Override // defpackage.s87
        public final void c(r47 r47Var, boolean z) {
            r47Var.getClass();
            q57 q57Var = this.h.b;
            q57Var.getClass();
            p87 p87VarB = q57Var.s.b(r47Var.u.t);
            q57Var.w.put(r47Var, Boolean.valueOf(z));
            if (!p87VarB.equals(this.g)) {
                Object obj = q57Var.t.get(p87VarB);
                obj.getClass();
                ((a) obj).c(r47Var, z);
                return;
            }
            j57 j57Var = q57Var.v;
            if (j57Var != null) {
                j57Var.invoke(r47Var);
                super.c(r47Var, z);
                g2b g2bVar = g2b.a;
                return;
            }
            h30<r47> h30Var = q57Var.f;
            int iIndexOf = h30Var.indexOf(r47Var);
            if (iIndexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + r47Var + " as it was not found on the current back stack");
                return;
            }
            int i = iIndexOf + 1;
            if (i != h30Var.v) {
                q57Var.n(h30Var.get(i).u.u.d, true, false);
            }
            q57.p(q57Var, r47Var);
            super.c(r47Var, z);
            g2b g2bVar2 = g2b.a;
            q57Var.b.invoke();
            q57Var.b();
        }

        @Override // defpackage.s87
        public final void d(r47 r47Var, boolean z) {
            r47Var.getClass();
            super.d(r47Var, z);
        }

        @Override // defpackage.s87
        public final void e(r47 r47Var) {
            r47Var.getClass();
            super.e(r47Var);
            q57 q57Var = this.h.b;
            q57Var.getClass();
            if (q57Var.f.contains(r47Var)) {
                r47Var.a(s66.b.w);
            } else {
                aa0.c("Cannot transition entry that is not in the back stack");
            }
        }

        @Override // defpackage.s87
        public final void f(r47 r47Var) {
            r47Var.getClass();
            q57 q57Var = this.h.b;
            q57Var.getClass();
            p87 p87VarB = q57Var.s.b(r47Var.u.t);
            if (!p87VarB.equals(this.g)) {
                Object obj = q57Var.t.get(p87VarB);
                if (obj != null) {
                    ((a) obj).f(r47Var);
                    return;
                } else {
                    p.a(av.a(new StringBuilder("NavigatorBackStack for "), r47Var.u.t, " should already be created"));
                    return;
                }
            }
            oh4<? super r47, g2b> oh4Var = q57Var.u;
            if (oh4Var != null) {
                oh4Var.invoke(r47Var);
                super.f(r47Var);
            } else {
                Log.i("NavController", "Ignoring add of destination " + r47Var.u + " outside of the call to navigate(). ");
            }
        }

        public final void g(r47 r47Var) {
            r47Var.getClass();
            super.f(r47Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends vg7 {
        public c() {
            super(false);
        }

        @Override // defpackage.vg7
        public final void handleOnBackPressed() {
            g57.this.e();
        }
    }

    public g57(Context context) {
        context.getClass();
        this.a = context;
        this.b = new q57(this, new d57(this));
        this.c = new c57(context);
        for (Object obj : ed9.d(context, new fz0(2))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new c();
                this.g = true;
                r87 r87Var = this.b.s;
                r87Var.a(new n67(r87Var));
                this.b.s.a(new h9(this.a));
                new o7a(new mh4() { // from class: e57
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        g57 g57Var = this.t;
                        Context context2 = g57Var.a;
                        r87 r87Var2 = g57Var.b.s;
                        context2.getClass();
                        r87Var2.getClass();
                        return new j77();
                    }
                });
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new c();
        this.g = true;
        r87 r87Var2 = this.b.s;
        r87Var2.a(new n67(r87Var2));
        this.b.s.a(new h9(this.a));
        new o7a(new mh4() { // from class: e57
            @Override // defpackage.mh4
            public final Object invoke() {
                g57 g57Var = this.t;
                Context context2 = g57Var.a;
                r87 r87Var3 = g57Var.b.s;
                context2.getClass();
                r87Var3.getClass();
                return new j77();
            }
        });
    }

    public static void c(g57 g57Var, String str, k77 k77Var, int i) {
        if ((i & 2) != 0) {
            k77Var = null;
        }
        g57Var.getClass();
        str.getClass();
        g57Var.b.m(str, k77Var);
    }

    public final int a() {
        h30<r47> h30Var = this.b.f;
        int i = 0;
        if (h30Var != null && h30Var.isEmpty()) {
            return 0;
        }
        Iterator<r47> it = h30Var.iterator();
        while (it.hasNext()) {
            if (!(it.next().u instanceof h67) && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final r47 b() {
        Object next;
        Iterator it = th1.M(this.b.f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((rx1) ed9.c(it)).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((r47) next).u instanceof h67)) {
                return (r47) next;
            }
        }
        next = null;
        return (r47) next;
    }

    public final boolean d() {
        Bundle bundleD;
        Intent intent;
        if (a() != 1) {
            return e();
        }
        Activity activity = this.d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        q57 q57Var = this.b;
        int i = 0;
        if (intArray == null) {
            c67 c67VarG = q57Var.g();
            c67VarG.getClass();
            int i2 = c67VarG.u.d;
            for (h67 h67Var = c67VarG.v; h67Var != null; h67Var = h67Var.v) {
                f67 f67Var = h67Var.u;
                if (h67Var.y.c != i2) {
                    Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        h67 h67VarJ = q57Var.j();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        c67.b bVarJ = h67VarJ.j(new b67(intent3.getAction(), intent3.getType(), intent3.getData()), h67VarJ);
                        if ((bVarJ != null ? bVarJ.u : null) != null && (bundleD = bVarJ.t.d(bVarJ.u)) != null) {
                            bundleC.putAll(bundleD);
                        }
                    }
                    a67 a67Var = new a67((o67) this);
                    int i3 = f67Var.d;
                    ArrayList arrayList = a67Var.e;
                    arrayList.clear();
                    arrayList.add(new a67.a(i3, null));
                    if (a67Var.d != null) {
                        a67Var.c();
                    }
                    a67Var.c.putExtra("android-support-nav:controller:deepLinkExtras", bundleC);
                    a67Var.a().e();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i2 = f67Var.d;
            }
        } else if (this.e) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray2.getClass();
            ArrayList arrayList2 = new ArrayList(intArray2.length);
            for (int i4 : intArray2) {
                arrayList2.add(Integer.valueOf(i4));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList2.size() >= 2) {
                int iIntValue = ((Number) rh1.r(arrayList2)).intValue();
                if (parcelableArrayList != null) {
                }
                c67 c67VarE = q57.e(iIntValue, q57Var.h(), null, false);
                if (c67VarE instanceof h67) {
                    int i5 = h67.z;
                    iIntValue = h67.a.a((h67) c67VarE).u.d;
                }
                c67 c67VarG2 = q57Var.g();
                if (c67VarG2 != null && iIntValue == c67VarG2.u.d) {
                    a67 a67Var2 = new a67((o67) this);
                    Bundle bundleC2 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                    bundleC2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleC2.putAll(bundle);
                    }
                    a67Var2.c.putExtra("android-support-nav:controller:deepLinkExtras", bundleC2);
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        int i7 = i + 1;
                        if (i < 0) {
                            ws0.m();
                            throw null;
                        }
                        a67Var2.e.add(new a67.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                        if (a67Var2.d != null) {
                            a67Var2.c();
                        }
                        i = i7;
                    }
                    a67Var2.a().e();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e() {
        q57 q57Var = this.b;
        if (!q57Var.f.isEmpty()) {
            c67 c67VarG = q57Var.g();
            c67VarG.getClass();
            if (q57Var.n(c67VarG.u.d, true, false) && q57Var.b()) {
                return true;
            }
        }
        return false;
    }
}
