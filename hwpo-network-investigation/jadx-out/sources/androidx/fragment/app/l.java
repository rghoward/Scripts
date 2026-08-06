package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.al;
import defpackage.av;
import defpackage.b19;
import defpackage.ba;
import defpackage.bh7;
import defpackage.cs6;
import defpackage.ct1;
import defpackage.da;
import defpackage.df4;
import defpackage.f04;
import defpackage.f19;
import defpackage.fg4;
import defpackage.g2b;
import defpackage.g76;
import defpackage.gh0;
import defpackage.gh7;
import defpackage.hi7;
import defpackage.j51;
import defpackage.ja;
import defpackage.jr6;
import defpackage.lb2;
import defpackage.le4;
import defpackage.ll8;
import defpackage.lx9;
import defpackage.m76;
import defpackage.m9;
import defpackage.mp2;
import defpackage.n9;
import defpackage.o9;
import defpackage.og5;
import defpackage.p51;
import defpackage.pf4;
import defpackage.rh1;
import defpackage.rh7;
import defpackage.s66;
import defpackage.s9;
import defpackage.sd1;
import defpackage.sh7;
import defpackage.sk0;
import defpackage.sy1;
import defpackage.t43;
import defpackage.th1;
import defpackage.u9;
import defpackage.ue4;
import defpackage.uhb;
import defpackage.vg7;
import defpackage.vhb;
import defpackage.we4;
import defpackage.wh0;
import defpackage.whb;
import defpackage.xd6;
import defpackage.xe4;
import defpackage.xr1;
import defpackage.ye4;
import defpackage.z90;
import defpackage.ze4;
import defpackage.zg7;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public androidx.fragment.app.f A;
    public da D;
    public da E;
    public da F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList<androidx.fragment.app.a> M;
    public ArrayList<Boolean> N;
    public ArrayList<androidx.fragment.app.f> O;
    public androidx.fragment.app.n P;
    public boolean b;
    public ArrayList<androidx.fragment.app.f> e;
    public zg7 g;
    public ue4<?> x;
    public le4 y;
    public androidx.fragment.app.f z;
    public final ArrayList<q> a = new ArrayList<>();
    public final androidx.fragment.app.q c = new androidx.fragment.app.q();
    public ArrayList<androidx.fragment.app.a> d = new ArrayList<>();
    public final androidx.fragment.app.j f = new androidx.fragment.app.j(this);
    public androidx.fragment.app.a h = null;
    public boolean i = false;
    public final b j = new b();
    public final AtomicInteger k = new AtomicInteger();
    public final Map<String, wh0> l = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> m = Collections.synchronizedMap(new HashMap());
    public final Map<String, o> n = Collections.synchronizedMap(new HashMap());
    public final ArrayList<p> o = new ArrayList<>();
    public final androidx.fragment.app.k p = new androidx.fragment.app.k(this);
    public final CopyOnWriteArrayList<df4> q = new CopyOnWriteArrayList<>();
    public final we4 r = new sy1() { // from class: we4
        @Override // defpackage.sy1
        public final void accept(Object obj) {
            Configuration configuration = (Configuration) obj;
            l lVar = this.a;
            if (lVar.O()) {
                lVar.j(false, configuration);
            }
        }
    };
    public final xe4 s = new sy1() { // from class: xe4
        @Override // defpackage.sy1
        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            l lVar = this.a;
            if (lVar.O() && num.intValue() == 80) {
                lVar.n(false);
            }
        }
    };
    public final ye4 t = new sy1() { // from class: ye4
        @Override // defpackage.sy1
        public final void accept(Object obj) {
            z07 z07Var = (z07) obj;
            l lVar = this.a;
            if (lVar.O()) {
                lVar.o(z07Var.a, false);
            }
        }
    };
    public final ze4 u = new sy1() { // from class: ze4
        @Override // defpackage.sy1
        public final void accept(Object obj) {
            az7 az7Var = (az7) obj;
            l lVar = this.a;
            if (lVar.O()) {
                lVar.t(az7Var.a, false);
            }
        }
    };
    public final c v = new c();
    public int w = -1;
    public final d B = new d();
    public final e C = new e();
    public ArrayDeque<n> G = new ArrayDeque<>();
    public final f Q = new f();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements n9<Map<String, Boolean>> {
        public a() {
        }

        @Override // defpackage.n9
        public final void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            l lVar = l.this;
            n nVarPollFirst = lVar.G.pollFirst();
            if (nVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = nVarPollFirst.t;
            int i2 = nVarPollFirst.u;
            androidx.fragment.app.f fVarC = lVar.c.c(str);
            if (fVarC != null) {
                fVarC.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends vg7 {
        public b() {
            super(false);
        }

        @Override // defpackage.vg7
        public final void handleOnBackCancelled() {
            boolean zM = l.M(3);
            l lVar = l.this;
            if (zM) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + lVar);
            }
            if (l.M(3)) {
                Log.d("FragmentManager", "cancelBackStackTransition for transition " + lVar.h);
            }
            androidx.fragment.app.a aVar = lVar.h;
            if (aVar != null) {
                aVar.s = false;
                aVar.g();
                androidx.fragment.app.a aVar2 = lVar.h;
                j51 j51Var = new j51(1, lVar);
                if (aVar2.q == null) {
                    aVar2.q = new ArrayList<>();
                }
                aVar2.q.add(j51Var);
                lVar.h.h(false, true);
                lVar.i = true;
                lVar.A(true);
                lVar.F();
                lVar.i = false;
                lVar.h = null;
            }
        }

        @Override // defpackage.vg7
        public final void handleOnBackPressed() {
            boolean zM = l.M(3);
            l lVar = l.this;
            if (zM) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + lVar);
            }
            b bVar = lVar.j;
            ArrayList<p> arrayList = lVar.o;
            lVar.i = true;
            lVar.A(true);
            int i = 0;
            lVar.i = false;
            if (lVar.h == null) {
                if (bVar.isEnabled()) {
                    if (l.M(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    lVar.T();
                    return;
                } else {
                    if (l.M(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    lVar.g.c().a();
                    return;
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashSet<androidx.fragment.app.f> linkedHashSet = new LinkedHashSet(l.G(lVar.h));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    p pVar = arrayList.get(i2);
                    i2++;
                    p pVar2 = pVar;
                    for (androidx.fragment.app.f fVar : linkedHashSet) {
                        pVar2.getClass();
                    }
                }
            }
            ArrayList<androidx.fragment.app.r.a> arrayList2 = lVar.h.a;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                androidx.fragment.app.r.a aVar = arrayList2.get(i3);
                i3++;
                androidx.fragment.app.f fVar2 = aVar.b;
                if (fVar2 != null) {
                    fVar2.mTransitioning = false;
                }
            }
            for (u uVar : lVar.g(new ArrayList(Collections.singletonList(lVar.h)), 0, 1)) {
                ArrayList arrayList3 = uVar.c;
                if (l.M(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                uVar.l(arrayList3);
                uVar.c(arrayList3);
            }
            ArrayList<androidx.fragment.app.r.a> arrayList4 = lVar.h.a;
            int size3 = arrayList4.size();
            while (i < size3) {
                androidx.fragment.app.r.a aVar2 = arrayList4.get(i);
                i++;
                androidx.fragment.app.f fVar3 = aVar2.b;
                if (fVar3 != null && fVar3.mContainer == null) {
                    lVar.h(fVar3).k();
                }
            }
            lVar.h = null;
            lVar.m0();
            if (l.M(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + bVar.isEnabled() + " for  FragmentManager " + lVar);
            }
        }

        @Override // defpackage.vg7
        public final void handleOnBackProgressed(gh0 gh0Var) {
            boolean zM = l.M(2);
            l lVar = l.this;
            if (zM) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + lVar);
            }
            if (lVar.h != null) {
                int i = 0;
                for (u uVar : lVar.g(new ArrayList(Collections.singletonList(lVar.h)), 0, 1)) {
                    uVar.getClass();
                    gh0Var.getClass();
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + gh0Var.c);
                    }
                    ArrayList arrayList = uVar.c;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        rh1.o(((u.c) obj).k, arrayList2);
                    }
                    List listT = th1.T(th1.X(arrayList2));
                    int size2 = listT.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((u.a) listT.get(i3)).d(gh0Var, uVar.a);
                    }
                }
                ArrayList<p> arrayList3 = lVar.o;
                int size3 = arrayList3.size();
                while (i < size3) {
                    p pVar = arrayList3.get(i);
                    i++;
                    pVar.getClass();
                }
            }
        }

        @Override // defpackage.vg7
        public final void handleOnBackStarted(gh0 gh0Var) {
            boolean zM = l.M(3);
            l lVar = l.this;
            if (zM) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + lVar);
            }
            lVar.x();
            lVar.y(lVar.new s(), false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements cs6 {
        public c() {
        }

        @Override // defpackage.cs6
        public final boolean a(MenuItem menuItem) {
            return l.this.q(menuItem);
        }

        @Override // defpackage.cs6
        public final void b(Menu menu) {
            l.this.r(menu);
        }

        @Override // defpackage.cs6
        public final void c(Menu menu, MenuInflater menuInflater) {
            l.this.l(menu, menuInflater);
        }

        @Override // defpackage.cs6
        public final void d(Menu menu) {
            l.this.u(menu);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends androidx.fragment.app.i {
        public d() {
        }

        @Override // androidx.fragment.app.i
        public final androidx.fragment.app.f a(ClassLoader classLoader, String str) {
            return androidx.fragment.app.f.instantiate(l.this.x.u, str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e implements lx9 {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l.this.A(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class g implements g76 {
        public final /* synthetic */ String t;
        public final /* synthetic */ pf4 u;
        public final /* synthetic */ s66 v;

        public g(String str, pf4 pf4Var, s66 s66Var) {
            this.t = str;
            this.u = pf4Var;
            this.v = s66Var;
        }

        @Override // defpackage.g76
        public final void t(m76 m76Var, s66.a aVar) {
            Bundle bundle;
            l lVar = l.this;
            Map<String, Bundle> map = lVar.m;
            s66.a aVar2 = s66.a.ON_START;
            String str = this.t;
            if (aVar == aVar2 && (bundle = map.get(str)) != null) {
                this.u.d(bundle, str);
                map.remove(str);
                if (l.M(2)) {
                    Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
                }
            }
            if (aVar == s66.a.ON_DESTROY) {
                this.v.c(this);
                lVar.n.remove(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class h implements df4 {
        public final /* synthetic */ androidx.fragment.app.f t;

        public h(androidx.fragment.app.f fVar) {
            this.t = fVar;
        }

        @Override // defpackage.df4
        public final void a(androidx.fragment.app.f fVar) {
            this.t.onAttachFragment(fVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class i implements n9<m9> {
        public i() {
        }

        @Override // defpackage.n9
        public final void a(m9 m9Var) {
            m9 m9Var2 = m9Var;
            l lVar = l.this;
            n nVarPollLast = lVar.G.pollLast();
            if (nVarPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = nVarPollLast.t;
            int i = nVarPollLast.u;
            androidx.fragment.app.f fVarC = lVar.c.c(str);
            if (fVarC != null) {
                fVarC.onActivityResult(i, m9Var2.t, m9Var2.u);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class j implements n9<m9> {
        public j() {
        }

        @Override // defpackage.n9
        public final void a(m9 m9Var) {
            m9 m9Var2 = m9Var;
            l lVar = l.this;
            n nVarPollFirst = lVar.G.pollFirst();
            if (nVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = nVarPollFirst.t;
            int i = nVarPollFirst.u;
            androidx.fragment.app.f fVarC = lVar.c.c(str);
            if (fVarC != null) {
                fVarC.onActivityResult(i, m9Var2.t, m9Var2.u);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface k {
        String getName();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$l, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class C0020l extends o9<og5, m9> {
        @Override // defpackage.o9
        public final Intent createIntent(Context context, og5 og5Var) {
            Bundle bundleExtra;
            og5 og5Var2 = og5Var;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = og5Var2.u;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    og5Var2 = new og5(og5Var2.t, null, og5Var2.v, og5Var2.w);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", og5Var2);
            if (l.M(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // defpackage.o9
        public final m9 parseResult(int i, Intent intent) {
            return new m9(i, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();
        public String t;
        public int u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                n nVar = new n();
                nVar.t = parcel.readString();
                nVar.u = parcel.readInt();
                return nVar;
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i) {
                return new n[i];
            }
        }

        public n(String str, int i) {
            this.t = str;
            this.u = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.t);
            parcel.writeInt(this.u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class o implements pf4 {
        public final s66 t;
        public final pf4 u;
        public final g v;

        public o(s66 s66Var, pf4 pf4Var, g gVar) {
            this.t = s66Var;
            this.u = pf4Var;
            this.v = gVar;
        }

        @Override // defpackage.pf4
        public final void d(Bundle bundle, String str) {
            this.u.d(bundle, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface p {
        void onBackStackChanged();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface q {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class r implements q {
        public final String a;
        public final int b;
        public final int c;

        public r(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.l.q
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.f fVar = l.this.A;
            if (fVar != null && this.b < 0 && this.a == null && fVar.getChildFragmentManager().U(-1, 0)) {
                return false;
            }
            return l.this.V(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class s implements q {
        public s() {
        }

        @Override // androidx.fragment.app.l.q
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            ArrayList<androidx.fragment.app.a> arrayList3;
            ArrayList<Boolean> arrayList4;
            boolean zV;
            l lVar = l.this;
            ArrayList<p> arrayList5 = lVar.o;
            if (l.M(2)) {
                Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + lVar.a);
            }
            int i = 0;
            if (lVar.d.isEmpty()) {
                Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                zV = false;
            } else {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) p51.b(1, lVar.d);
                lVar.h = aVar;
                ArrayList<androidx.fragment.app.r.a> arrayList6 = aVar.a;
                int size = arrayList6.size();
                int i2 = 0;
                while (i2 < size) {
                    androidx.fragment.app.r.a aVar2 = arrayList6.get(i2);
                    i2++;
                    androidx.fragment.app.f fVar = aVar2.b;
                    if (fVar != null) {
                        fVar.mTransitioning = true;
                    }
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                zV = lVar.V(arrayList3, arrayList4, null, -1, 0);
            }
            if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
                arrayList4.get(arrayList3.size() - 1).getClass();
                LinkedHashSet<androidx.fragment.app.f> linkedHashSet = new LinkedHashSet();
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    androidx.fragment.app.a aVar3 = arrayList3.get(i3);
                    i3++;
                    linkedHashSet.addAll(l.G(aVar3));
                }
                int size3 = arrayList5.size();
                while (i < size3) {
                    p pVar = arrayList5.get(i);
                    i++;
                    p pVar2 = pVar;
                    for (androidx.fragment.app.f fVar2 : linkedHashSet) {
                        pVar2.getClass();
                    }
                }
            }
            return zV;
        }
    }

    public static HashSet G(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.a.size(); i2++) {
            androidx.fragment.app.f fVar = aVar.a.get(i2).b;
            if (fVar != null && aVar.g) {
                hashSet.add(fVar);
            }
        }
        return hashSet;
    }

    public static boolean M(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean N(androidx.fragment.app.f fVar) {
        if (fVar.mHasMenu && fVar.mMenuVisible) {
            return true;
        }
        ArrayList arrayListE = fVar.mChildFragmentManager.c.e();
        int size = arrayListE.size();
        boolean zN = false;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListE.get(i2);
            i2++;
            androidx.fragment.app.f fVar2 = (androidx.fragment.app.f) obj;
            if (fVar2 != null) {
                zN = N(fVar2);
            }
            if (zN) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(androidx.fragment.app.f fVar) {
        if (fVar == null) {
            return true;
        }
        l lVar = fVar.mFragmentManager;
        return fVar.equals(lVar.A) && P(lVar.z);
    }

    public static void j0(androidx.fragment.app.f fVar) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + fVar);
        }
        if (fVar.mHidden) {
            fVar.mHidden = false;
            fVar.mHiddenChanged = !fVar.mHiddenChanged;
        }
    }

    public final boolean A(boolean z) {
        boolean zA;
        ArrayList<q> arrayList;
        androidx.fragment.app.a aVar;
        z(z);
        if (!this.i && (aVar = this.h) != null) {
            aVar.s = false;
            aVar.g();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.h(false, false);
            this.a.add(0, this.h);
            ArrayList<androidx.fragment.app.r.a> arrayList2 = this.h.a;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                androidx.fragment.app.r.a aVar2 = arrayList2.get(i2);
                i2++;
                androidx.fragment.app.f fVar = aVar2.b;
                if (fVar != null) {
                    fVar.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.M;
            ArrayList<Boolean> arrayList4 = this.N;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        int i3 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i3 >= size2) {
                                break;
                            }
                            zA |= arrayList.get(i3).a(arrayList3, arrayList4);
                            i3++;
                            throw th;
                        }
                        arrayList.clear();
                        this.x.v.removeCallbacks(this.Q);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.x.v.removeCallbacks(this.Q);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.b = true;
            try {
                Y(this.M, this.N);
                d();
                z2 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        m0();
        if (this.L) {
            this.L = false;
            ArrayList arrayListD = this.c.d();
            int size3 = arrayListD.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj = arrayListD.get(i4);
                i4++;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) obj;
                androidx.fragment.app.f fVar2 = pVar.c;
                if (fVar2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fVar2.mDeferStart = false;
                        pVar.k();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void B(androidx.fragment.app.a aVar, boolean z) {
        if (z && (this.x == null || this.K)) {
            return;
        }
        z(z);
        androidx.fragment.app.a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.s = false;
            aVar2.g();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + aVar);
            }
            this.h.h(false, false);
            this.h.a(this.M, this.N);
            ArrayList<androidx.fragment.app.r.a> arrayList = this.h.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                androidx.fragment.app.r.a aVar3 = arrayList.get(i2);
                i2++;
                androidx.fragment.app.f fVar = aVar3.b;
                if (fVar != null) {
                    fVar.mTransitioning = false;
                }
            }
            this.h = null;
        }
        aVar.a(this.M, this.N);
        this.b = true;
        try {
            Y(this.M, this.N);
            d();
            m0();
            boolean z2 = this.L;
            androidx.fragment.app.q qVar = this.c;
            if (z2) {
                this.L = false;
                ArrayList arrayListD = qVar.d();
                int size2 = arrayListD.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayListD.get(i3);
                    i3++;
                    androidx.fragment.app.p pVar = (androidx.fragment.app.p) obj;
                    androidx.fragment.app.f fVar2 = pVar.c;
                    if (fVar2.mDeferStart) {
                        if (this.b) {
                            this.L = true;
                        } else {
                            fVar2.mDeferStart = false;
                            pVar.k();
                        }
                    }
                }
            }
            qVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021a A[PHI: r15
      0x021a: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:100:0x0207, B:104:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    public final void C(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        boolean z3 = arrayList.get(i8).p;
        ArrayList<androidx.fragment.app.f> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<androidx.fragment.app.f> arrayList4 = this.O;
        androidx.fragment.app.q qVar = this.c;
        arrayList4.addAll(qVar.f());
        androidx.fragment.app.f fVar = this.A;
        int i9 = i8;
        boolean z4 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i3) {
                boolean z5 = z3;
                boolean z6 = z4;
                this.O.clear();
                if (!z5 && this.w >= 1) {
                    for (int i11 = i8; i11 < i3; i11++) {
                        ArrayList<androidx.fragment.app.r.a> arrayList5 = arrayList.get(i11).a;
                        int size = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size) {
                            androidx.fragment.app.r.a aVar = arrayList5.get(i12);
                            i12++;
                            androidx.fragment.app.f fVar2 = aVar.b;
                            if (fVar2 != null && fVar2.mFragmentManager != null) {
                                qVar.g(h(fVar2));
                            }
                        }
                    }
                }
                int i13 = i8;
                while (i13 < i3) {
                    androidx.fragment.app.a aVar2 = arrayList.get(i13);
                    if (!arrayList2.get(i13).booleanValue()) {
                        aVar2.f(1);
                        l lVar = aVar2.r;
                        ArrayList<androidx.fragment.app.r.a> arrayList6 = aVar2.a;
                        int size2 = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            androidx.fragment.app.r.a aVar3 = arrayList6.get(i14);
                            androidx.fragment.app.f fVar3 = aVar3.b;
                            if (fVar3 != null) {
                                fVar3.mBeingSaved = false;
                                fVar3.setPopDirection(false);
                                fVar3.setNextTransition(aVar2.f);
                                fVar3.setSharedElementNames(aVar2.n, aVar2.o);
                            }
                            switch (aVar3.a) {
                                case 1:
                                    i13 = i13;
                                    fVar3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    lVar.d0(fVar3, false);
                                    lVar.a(fVar3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 2:
                                default:
                                    mp2.a(aVar3.a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    fVar3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    lVar.X(fVar3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 4:
                                    fVar3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    lVar.L(fVar3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 5:
                                    fVar3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    lVar.d0(fVar3, false);
                                    j0(fVar3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 6:
                                    fVar3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    lVar.i(fVar3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 7:
                                    fVar3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    lVar.d0(fVar3, false);
                                    lVar.c(fVar3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 8:
                                    lVar.h0(fVar3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 9:
                                    lVar.h0(null);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 10:
                                    aVar3.h = fVar3.mMaxState;
                                    lVar.g0(fVar3, aVar3.i);
                                    i14++;
                                    i13 = i13;
                                    break;
                            }
                            return;
                        }
                    }
                    aVar2.f(-1);
                    l lVar2 = aVar2.r;
                    ArrayList<androidx.fragment.app.r.a> arrayList7 = aVar2.a;
                    boolean z7 = true;
                    for (int size3 = arrayList7.size() - 1; size3 >= 0; size3--) {
                        androidx.fragment.app.r.a aVar4 = arrayList7.get(size3);
                        androidx.fragment.app.f fVar4 = aVar4.b;
                        if (fVar4 != null) {
                            fVar4.mBeingSaved = false;
                            fVar4.setPopDirection(z7);
                            int i15 = aVar2.f;
                            int i16 = 8194;
                            int i17 = 4097;
                            if (i15 != 4097) {
                                if (i15 != 8194) {
                                    i16 = 4100;
                                    if (i15 != 8197) {
                                        i17 = 4099;
                                        if (i15 != 4099) {
                                            i16 = i15 != 4100 ? 0 : 8197;
                                        } else {
                                            i16 = i17;
                                        }
                                    }
                                } else {
                                    i16 = i17;
                                }
                            }
                            fVar4.setNextTransition(i16);
                            fVar4.setSharedElementNames(aVar2.o, aVar2.n);
                        }
                        switch (aVar4.a) {
                            case 1:
                                fVar4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                z7 = true;
                                lVar2.d0(fVar4, true);
                                lVar2.X(fVar4);
                                break;
                            case 2:
                            default:
                                mp2.a(aVar4.a, "Unknown cmd: ");
                                break;
                            case 3:
                                fVar4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                lVar2.a(fVar4);
                                z7 = true;
                                break;
                            case 4:
                                fVar4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                lVar2.getClass();
                                j0(fVar4);
                                z7 = true;
                                break;
                            case 5:
                                fVar4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                lVar2.d0(fVar4, true);
                                lVar2.L(fVar4);
                                z7 = true;
                                break;
                            case 6:
                                fVar4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                lVar2.c(fVar4);
                                z7 = true;
                                break;
                            case 7:
                                fVar4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                lVar2.d0(fVar4, true);
                                lVar2.i(fVar4);
                                z7 = true;
                                break;
                            case 8:
                                lVar2.h0(null);
                                z7 = true;
                                break;
                            case 9:
                                lVar2.h0(fVar4);
                                z7 = true;
                                break;
                            case 10:
                                aVar4.i = fVar4.mMaxState;
                                lVar2.g0(fVar4, aVar4.h);
                                z7 = true;
                                break;
                        }
                        return;
                    }
                    i13++;
                }
                boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
                ArrayList<p> arrayList8 = this.o;
                if (z6 && !arrayList8.isEmpty()) {
                    LinkedHashSet<androidx.fragment.app.f> linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    int i18 = 0;
                    while (i18 < size4) {
                        androidx.fragment.app.a aVar5 = arrayList.get(i18);
                        i18++;
                        linkedHashSet.addAll(G(aVar5));
                    }
                    if (this.h == null) {
                        int size5 = arrayList8.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            p pVar = arrayList8.get(i19);
                            i19++;
                            p pVar2 = pVar;
                            for (androidx.fragment.app.f fVar5 : linkedHashSet) {
                                pVar2.getClass();
                            }
                        }
                        int size6 = arrayList8.size();
                        int i20 = 0;
                        while (i20 < size6) {
                            p pVar3 = arrayList8.get(i20);
                            i20++;
                            p pVar4 = pVar3;
                            for (androidx.fragment.app.f fVar6 : linkedHashSet) {
                                pVar4.getClass();
                            }
                        }
                    }
                }
                for (int i21 = i8; i21 < i3; i21++) {
                    androidx.fragment.app.a aVar6 = arrayList.get(i21);
                    if (zBooleanValue) {
                        for (int size7 = aVar6.a.size() - 1; size7 >= 0; size7--) {
                            androidx.fragment.app.f fVar7 = aVar6.a.get(size7).b;
                            if (fVar7 != null) {
                                h(fVar7).k();
                            }
                        }
                    } else {
                        ArrayList<androidx.fragment.app.r.a> arrayList9 = aVar6.a;
                        int size8 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size8) {
                            androidx.fragment.app.r.a aVar7 = arrayList9.get(i22);
                            i22++;
                            androidx.fragment.app.f fVar8 = aVar7.b;
                            if (fVar8 != null) {
                                h(fVar8).k();
                            }
                        }
                    }
                }
                R(this.w, true);
                for (u uVar : g(arrayList, i8, i3)) {
                    uVar.e = zBooleanValue;
                    uVar.k();
                    uVar.e();
                }
                while (i8 < i3) {
                    androidx.fragment.app.a aVar8 = arrayList.get(i8);
                    if (arrayList2.get(i8).booleanValue() && aVar8.t >= 0) {
                        aVar8.t = -1;
                    }
                    if (aVar8.q != null) {
                        for (int i23 = 0; i23 < aVar8.q.size(); i23++) {
                            aVar8.q.get(i23).run();
                        }
                        aVar8.q = null;
                    }
                    i8++;
                }
                if (z6) {
                    for (int i24 = 0; i24 < arrayList8.size(); i24++) {
                        arrayList8.get(i24).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            androidx.fragment.app.a aVar9 = arrayList.get(i9);
            boolean zBooleanValue2 = arrayList2.get(i9).booleanValue();
            ArrayList<androidx.fragment.app.f> arrayList10 = this.O;
            if (zBooleanValue2) {
                z = z3;
                i4 = i9;
                z2 = z4;
                int i25 = 1;
                ArrayList<androidx.fragment.app.r.a> arrayList11 = aVar9.a;
                int size9 = arrayList11.size() - 1;
                while (size9 >= 0) {
                    androidx.fragment.app.r.a aVar10 = arrayList11.get(size9);
                    int i26 = aVar10.a;
                    if (i26 == i25) {
                        arrayList10.remove(aVar10.b);
                    } else if (i26 != 3) {
                        switch (i26) {
                            case 6:
                                arrayList10.add(aVar10.b);
                                break;
                            case 7:
                                arrayList10.remove(aVar10.b);
                                break;
                            case 8:
                                fVar = null;
                                break;
                            case 9:
                                fVar = aVar10.b;
                                break;
                            case 10:
                                aVar10.i = aVar10.h;
                                break;
                        }
                    } else {
                        arrayList10.add(aVar10.b);
                    }
                    size9--;
                    i25 = 1;
                }
            } else {
                ArrayList<androidx.fragment.app.r.a> arrayList12 = aVar9.a;
                int i27 = 0;
                while (i27 < arrayList12.size()) {
                    androidx.fragment.app.r.a aVar11 = arrayList12.get(i27);
                    boolean z8 = z3;
                    int i28 = aVar11.a;
                    if (i28 != i10) {
                        i5 = i9;
                        if (i28 != 2) {
                            if (i28 == 3 || i28 == 6) {
                                arrayList10.remove(aVar11.b);
                                androidx.fragment.app.f fVar9 = aVar11.b;
                                if (fVar9 == fVar) {
                                    arrayList12.add(i27, new androidx.fragment.app.r.a(fVar9, 9));
                                    i27++;
                                    fVar = null;
                                }
                                i6 = 1;
                            } else if (i28 == 7) {
                                i6 = 1;
                            } else if (i28 == 8) {
                                arrayList12.add(i27, new androidx.fragment.app.r.a(9, fVar, 0));
                                aVar11.c = true;
                                i27++;
                                fVar = aVar11.b;
                            }
                            i6 = 1;
                        } else {
                            androidx.fragment.app.f fVar10 = aVar11.b;
                            int i29 = fVar10.mContainerId;
                            int size10 = arrayList10.size() - 1;
                            boolean z9 = false;
                            while (size10 >= 0) {
                                int i30 = size10;
                                androidx.fragment.app.f fVar11 = arrayList10.get(size10);
                                boolean z10 = z4;
                                if (fVar11.mContainerId != i29) {
                                    i29 = i29;
                                } else if (fVar11 == fVar10) {
                                    i29 = i29;
                                    z9 = true;
                                } else {
                                    if (fVar11 == fVar) {
                                        i7 = 0;
                                        arrayList12.add(i27, new androidx.fragment.app.r.a(9, fVar11, 0));
                                        i27++;
                                        fVar = null;
                                    } else {
                                        i7 = 0;
                                    }
                                    androidx.fragment.app.r.a aVar12 = new androidx.fragment.app.r.a(3, fVar11, i7);
                                    aVar12.d = aVar11.d;
                                    aVar12.f = aVar11.f;
                                    aVar12.e = aVar11.e;
                                    aVar12.g = aVar11.g;
                                    arrayList12.add(i27, aVar12);
                                    arrayList10.remove(fVar11);
                                    i27++;
                                    fVar = fVar;
                                }
                                size10 = i30 - 1;
                                i29 = i29;
                                z4 = z10;
                            }
                            z4 = z4;
                            i6 = 1;
                            if (z9) {
                                arrayList12.remove(i27);
                                i27--;
                            } else {
                                aVar11.a = 1;
                                aVar11.c = true;
                                arrayList10.add(fVar10);
                            }
                        }
                        i27 += i6;
                        i10 = i6;
                        z3 = z8;
                        i9 = i5;
                        z4 = z4;
                    } else {
                        i5 = i9;
                        i6 = i10;
                    }
                    z4 = z4;
                    arrayList10.add(aVar11.b);
                    i27 += i6;
                    i10 = i6;
                    z3 = z8;
                    i9 = i5;
                    z4 = z4;
                }
                z = z3;
                i4 = i9;
                z2 = z4;
            }
            z4 = z2 || aVar9.g;
            i9 = i4 + 1;
            z3 = z;
        }
    }

    public final androidx.fragment.app.f D(int i2) {
        androidx.fragment.app.q qVar = this.c;
        ArrayList<androidx.fragment.app.f> arrayList = qVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.fragment.app.f fVar = arrayList.get(size);
            if (fVar != null && fVar.mFragmentId == i2) {
                return fVar;
            }
        }
        for (androidx.fragment.app.p pVar : qVar.b.values()) {
            if (pVar != null) {
                androidx.fragment.app.f fVar2 = pVar.c;
                if (fVar2.mFragmentId == i2) {
                    return fVar2;
                }
            }
        }
        return null;
    }

    public final androidx.fragment.app.f E(String str) {
        androidx.fragment.app.q qVar = this.c;
        ArrayList<androidx.fragment.app.f> arrayList = qVar.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                androidx.fragment.app.f fVar = arrayList.get(size);
                if (fVar != null && str.equals(fVar.mTag)) {
                    return fVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.p pVar : qVar.b.values()) {
            if (pVar != null) {
                androidx.fragment.app.f fVar2 = pVar.c;
                if (str.equals(fVar2.mTag)) {
                    return fVar2;
                }
            }
        }
        return null;
    }

    public final void F() {
        for (u uVar : f()) {
            if (uVar.f) {
                if (M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                uVar.f = false;
                uVar.e();
            }
        }
    }

    public final int H() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final ViewGroup I(androidx.fragment.app.f fVar) {
        ViewGroup viewGroup = fVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fVar.mContainerId <= 0 || !this.y.c()) {
            return null;
        }
        View viewB = this.y.b(fVar.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final androidx.fragment.app.i J() {
        androidx.fragment.app.f fVar = this.z;
        return fVar != null ? fVar.mFragmentManager.J() : this.B;
    }

    public final lx9 K() {
        androidx.fragment.app.f fVar = this.z;
        return fVar != null ? fVar.mFragmentManager.K() : this.C;
    }

    public final void L(androidx.fragment.app.f fVar) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + fVar);
        }
        if (fVar.mHidden) {
            return;
        }
        fVar.mHidden = true;
        fVar.mHiddenChanged = true ^ fVar.mHiddenChanged;
        i0(fVar);
    }

    public final boolean O() {
        androidx.fragment.app.f fVar = this.z;
        if (fVar == null) {
            return true;
        }
        return fVar.isAdded() && this.z.getParentFragmentManager().O();
    }

    public final boolean Q() {
        return this.I || this.J;
    }

    public final void R(int i2, boolean z) {
        ue4<?> ue4Var;
        if (this.x == null && i2 != -1) {
            aa0.c("No activity");
            return;
        }
        if (z || i2 != this.w) {
            this.w = i2;
            androidx.fragment.app.q qVar = this.c;
            HashMap<String, androidx.fragment.app.p> map = qVar.b;
            ArrayList<androidx.fragment.app.f> arrayList = qVar.a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                androidx.fragment.app.f fVar = arrayList.get(i3);
                i3++;
                androidx.fragment.app.p pVar = map.get(fVar.mWho);
                if (pVar != null) {
                    pVar.k();
                }
            }
            for (androidx.fragment.app.p pVar2 : map.values()) {
                if (pVar2 != null) {
                    pVar2.k();
                    androidx.fragment.app.f fVar2 = pVar2.c;
                    if (fVar2.mRemoving && !fVar2.isInBackStack()) {
                        if (fVar2.mBeingSaved && !qVar.c.containsKey(fVar2.mWho)) {
                            qVar.i(pVar2.n(), fVar2.mWho);
                        }
                        qVar.h(pVar2);
                    }
                }
            }
            ArrayList arrayListD = qVar.d();
            int size2 = arrayListD.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj = arrayListD.get(i4);
                i4++;
                androidx.fragment.app.p pVar3 = (androidx.fragment.app.p) obj;
                androidx.fragment.app.f fVar3 = pVar3.c;
                if (fVar3.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fVar3.mDeferStart = false;
                        pVar3.k();
                    }
                }
            }
            if (this.H && (ue4Var = this.x) != null && this.w == 7) {
                ue4Var.h();
                this.H = false;
            }
        }
    }

    public final void S() {
        if (this.x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.y = false;
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null) {
                fVar.noteStateNotSaved();
            }
        }
    }

    public final boolean T() {
        return U(-1, 0);
    }

    public final boolean U(int i2, int i3) {
        A(false);
        z(true);
        androidx.fragment.app.f fVar = this.A;
        if (fVar != null && i2 < 0 && fVar.getChildFragmentManager().T()) {
            return true;
        }
        boolean zV = V(this.M, this.N, null, i2, i3);
        if (zV) {
            this.b = true;
            try {
                Y(this.M, this.N);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        m0();
        boolean z = this.L;
        androidx.fragment.app.q qVar = this.c;
        if (z) {
            this.L = false;
            ArrayList arrayListD = qVar.d();
            int size = arrayListD.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListD.get(i4);
                i4++;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) obj;
                androidx.fragment.app.f fVar2 = pVar.c;
                if (fVar2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fVar2.mDeferStart = false;
                        pVar.k();
                    }
                }
            }
        }
        qVar.b.values().removeAll(Collections.singleton(null));
        return zV;
    }

    public final boolean V(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        boolean z = (i3 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (str != null || i2 >= 0) {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.i)) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        androidx.fragment.app.a aVar2 = this.d.get(size - 1);
                        if ((str == null || !str.equals(aVar2.i)) && (i2 < 0 || i2 != aVar2.t)) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            } else {
                size = z ? 0 : this.d.size() - 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void W(Bundle bundle, String str, androidx.fragment.app.f fVar) {
        if (fVar.mFragmentManager == this) {
            bundle.putString(str, fVar.mWho);
        } else {
            k0(new IllegalStateException(xr1.b("Fragment ", fVar, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void X(androidx.fragment.app.f fVar) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + fVar + " nesting=" + fVar.mBackStackNesting);
        }
        boolean zIsInBackStack = fVar.isInBackStack();
        if (fVar.mDetached && zIsInBackStack) {
            return;
        }
        androidx.fragment.app.q qVar = this.c;
        synchronized (qVar.a) {
            qVar.a.remove(fVar);
        }
        fVar.mAdded = false;
        if (N(fVar)) {
            this.H = true;
        }
        fVar.mRemoving = true;
        i0(fVar);
    }

    public final void Y(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            aa0.c("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    C(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                C(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            C(arrayList, arrayList2, i3, size);
        }
    }

    public final void Z(Bundle bundle) {
        androidx.fragment.app.k kVar;
        int i2;
        Bundle bundle2;
        androidx.fragment.app.p pVar;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.x.u.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.x.u.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        androidx.fragment.app.q qVar = this.c;
        HashMap<String, Bundle> map2 = qVar.c;
        HashMap<String, androidx.fragment.app.p> map3 = qVar.b;
        map2.clear();
        map2.putAll(map);
        androidx.fragment.app.m mVar = (androidx.fragment.app.m) bundle.getParcelable("state");
        if (mVar == null) {
            return;
        }
        map3.clear();
        ArrayList<String> arrayList = mVar.t;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            kVar = this.p;
            int i4 = 2;
            if (i3 >= size) {
                break;
            }
            String str3 = arrayList.get(i3);
            i3++;
            Bundle bundleI = qVar.i(null, str3);
            if (bundleI != null) {
                androidx.fragment.app.f fVar = this.P.t.get(((androidx.fragment.app.o) bundleI.getParcelable("state")).u);
                if (fVar != null) {
                    if (M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fVar);
                    }
                    pVar = new androidx.fragment.app.p(kVar, qVar, fVar, bundleI);
                    bundle2 = bundleI;
                } else {
                    i4 = 2;
                    bundle2 = bundleI;
                    pVar = new androidx.fragment.app.p(this.p, this.c, this.x.u.getClassLoader(), J(), bundleI);
                }
                androidx.fragment.app.f fVar2 = pVar.c;
                fVar2.mSavedFragmentState = bundle2;
                fVar2.mFragmentManager = this;
                if (M(i4)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fVar2.mWho + "): " + fVar2);
                }
                pVar.l(this.x.u.getClassLoader());
                qVar.g(pVar);
                pVar.e = this.w;
            }
        }
        androidx.fragment.app.n nVar = this.P;
        nVar.getClass();
        ArrayList arrayList2 = new ArrayList(nVar.t.values());
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList2.get(i5);
            i5++;
            androidx.fragment.app.f fVar3 = (androidx.fragment.app.f) obj;
            if (map3.get(fVar3.mWho) == null) {
                if (M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fVar3 + " that was not found in the set of active Fragments " + mVar.t);
                }
                this.P.f(fVar3);
                fVar3.mFragmentManager = this;
                androidx.fragment.app.p pVar2 = new androidx.fragment.app.p(kVar, qVar, fVar3);
                pVar2.e = 1;
                pVar2.k();
                fVar3.mRemoving = true;
                pVar2.k();
            }
        }
        ArrayList<String> arrayList3 = mVar.u;
        qVar.a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                String str4 = arrayList3.get(i6);
                i6++;
                String str5 = str4;
                androidx.fragment.app.f fVarB = qVar.b(str5);
                if (fVarB == null) {
                    aa0.c(sk0.c("No instantiated fragment for (", str5, ")"));
                    return;
                }
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str5 + "): " + fVarB);
                }
                qVar.a(fVarB);
            }
        }
        if (mVar.v != null) {
            this.d = new ArrayList<>(mVar.v.length);
            int i7 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = mVar.v;
                if (i7 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i7];
                ArrayList<String> arrayList4 = bVar.u;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int[] iArr = bVar.t;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    androidx.fragment.app.r.a aVar2 = new androidx.fragment.app.r.a();
                    int i10 = i8 + 1;
                    aVar2.a = iArr[i8];
                    if (M(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    aVar2.h = s66.b.values()[bVar.v[i9]];
                    aVar2.i = s66.b.values()[bVar.w[i9]];
                    int i11 = i8 + 2;
                    aVar2.c = iArr[i10] != 0;
                    int i12 = iArr[i11];
                    aVar2.d = i12;
                    int i13 = iArr[i8 + 3];
                    aVar2.e = i13;
                    int i14 = i8 + 5;
                    int i15 = iArr[i8 + 4];
                    aVar2.f = i15;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i16 = iArr2[i14];
                    aVar2.g = i16;
                    aVar.b = i12;
                    aVar.c = i13;
                    aVar.d = i15;
                    aVar.e = i16;
                    aVar.b(aVar2);
                    i9++;
                    iArr = iArr2;
                }
                aVar.f = bVar.x;
                aVar.i = bVar.y;
                aVar.g = true;
                aVar.j = bVar.A;
                aVar.k = bVar.B;
                aVar.l = bVar.C;
                aVar.m = bVar.D;
                aVar.n = bVar.E;
                aVar.o = bVar.F;
                aVar.p = bVar.G;
                aVar.t = bVar.z;
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    String str6 = arrayList4.get(i17);
                    if (str6 != null) {
                        aVar.a.get(i17).b = qVar.b(str6);
                    }
                }
                aVar.f(1);
                if (M(2)) {
                    StringBuilder sbB = t43.b(i7, "restoreAllState: back stack #", " (index ");
                    sbB.append(aVar.t);
                    sbB.append("): ");
                    sbB.append(aVar);
                    Log.v("FragmentManager", sbB.toString());
                    PrintWriter printWriter = new PrintWriter(new xd6());
                    aVar.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i7++;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList<>();
        }
        this.k.set(mVar.w);
        String str7 = mVar.x;
        if (str7 != null) {
            androidx.fragment.app.f fVarB2 = qVar.b(str7);
            this.A = fVarB2;
            s(fVarB2);
        }
        ArrayList<String> arrayList5 = mVar.y;
        if (arrayList5 != null) {
            for (int i18 = i2; i18 < arrayList5.size(); i18++) {
                this.l.put(arrayList5.get(i18), mVar.z.get(i18));
            }
        }
        this.G = new ArrayDeque<>(mVar.A);
    }

    public final androidx.fragment.app.p a(androidx.fragment.app.f fVar) {
        String str = fVar.mPreviousWho;
        if (str != null) {
            fg4.c(fVar, str);
        }
        if (M(2)) {
            Log.v("FragmentManager", "add: " + fVar);
        }
        androidx.fragment.app.p pVarH = h(fVar);
        fVar.mFragmentManager = this;
        androidx.fragment.app.q qVar = this.c;
        qVar.g(pVarH);
        if (!fVar.mDetached) {
            qVar.a(fVar);
            fVar.mRemoving = false;
            if (fVar.mView == null) {
                fVar.mHiddenChanged = false;
            }
            if (N(fVar)) {
                this.H = true;
            }
        }
        return pVarH;
    }

    public final Bundle a0() {
        int i2;
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.I = true;
        this.P.y = true;
        androidx.fragment.app.q qVar = this.c;
        qVar.getClass();
        HashMap<String, androidx.fragment.app.p> map = qVar.b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (androidx.fragment.app.p pVar : map.values()) {
            if (pVar != null) {
                androidx.fragment.app.f fVar = pVar.c;
                qVar.i(pVar.n(), fVar.mWho);
                arrayList2.add(fVar.mWho);
                if (M(2)) {
                    Log.v("FragmentManager", "Saved state of " + fVar + ": " + fVar.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.c.c;
        if (!map2.isEmpty()) {
            androidx.fragment.app.q qVar2 = this.c;
            synchronized (qVar2.a) {
                try {
                    bVarArr = null;
                    if (qVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(qVar2.a.size());
                        ArrayList<androidx.fragment.app.f> arrayList3 = qVar2.a;
                        int size = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size) {
                            androidx.fragment.app.f fVar2 = arrayList3.get(i3);
                            i3++;
                            androidx.fragment.app.f fVar3 = fVar2;
                            arrayList.add(fVar3.mWho);
                            if (M(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fVar3.mWho + "): " + fVar3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                bVarArr = new androidx.fragment.app.b[size2];
                for (i2 = 0; i2 < size2; i2++) {
                    bVarArr[i2] = new androidx.fragment.app.b(this.d.get(i2));
                    if (M(2)) {
                        StringBuilder sbB = t43.b(i2, "saveAllState: adding back stack #", ": ");
                        sbB.append(this.d.get(i2));
                        Log.v("FragmentManager", sbB.toString());
                    }
                }
            }
            androidx.fragment.app.m mVar = new androidx.fragment.app.m();
            mVar.t = arrayList2;
            mVar.u = arrayList;
            mVar.v = bVarArr;
            mVar.w = this.k.get();
            androidx.fragment.app.f fVar4 = this.A;
            if (fVar4 != null) {
                mVar.x = fVar4.mWho;
            }
            mVar.y.addAll(this.l.keySet());
            mVar.z.addAll(this.l.values());
            mVar.A = new ArrayList<>(this.G);
            bundle.putParcelable("state", mVar);
            for (String str : this.m.keySet()) {
                bundle.putBundle(ct1.a("result_", str), this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(ct1.a("fragment_", str2), map2.get(str2));
            }
        } else if (M(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ue4<?> ue4Var, le4 le4Var, androidx.fragment.app.f fVar) {
        m76 m76Var;
        if (this.x != null) {
            aa0.c("Already attached");
            return;
        }
        this.x = ue4Var;
        this.y = le4Var;
        this.z = fVar;
        CopyOnWriteArrayList<df4> copyOnWriteArrayList = this.q;
        if (fVar != null) {
            copyOnWriteArrayList.add(new h(fVar));
        } else if (ue4Var instanceof df4) {
            copyOnWriteArrayList.add((df4) ue4Var);
        }
        if (this.z != null) {
            m0();
        }
        if (ue4Var instanceof bh7) {
            bh7 bh7Var = (bh7) ue4Var;
            zg7 onBackPressedDispatcher = bh7Var.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            if (fVar != null) {
                m76Var = bh7Var;
                m76Var = fVar;
            }
            m76Var = bh7Var;
            onBackPressedDispatcher.a(m76Var, this.j);
        }
        if (fVar != null) {
            androidx.fragment.app.n nVar = fVar.mFragmentManager.P;
            HashMap<String, androidx.fragment.app.n> map = nVar.u;
            androidx.fragment.app.n nVar2 = map.get(fVar.mWho);
            if (nVar2 == null) {
                nVar2 = new androidx.fragment.app.n(nVar.w);
                map.put(fVar.mWho, nVar2);
            }
            this.P = nVar2;
        } else if (ue4Var instanceof whb) {
            vhb viewModelStore = ((whb) ue4Var).getViewModelStore();
            viewModelStore.getClass();
            lb2.a aVar = lb2.a.b;
            aVar.getClass();
            uhb uhbVar = new uhb(viewModelStore, androidx.fragment.app.n.z, aVar);
            sd1 sd1VarA = ll8.a(androidx.fragment.app.n.class);
            String strE = sd1VarA.e();
            if (strE == null) {
                z90.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.P = (androidx.fragment.app.n) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
        } else {
            this.P = new androidx.fragment.app.n(false);
        }
        this.P.y = Q();
        this.c.d = this.P;
        Object obj = this.x;
        if ((obj instanceof f19) && fVar == null) {
            b19 savedStateRegistry = ((f19) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new b19.b() { // from class: af4
                @Override // b19.b
                public final Bundle a() {
                    return this.a.a0();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                Z(bundleA);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof ja) {
            ba activityResultRegistry = ((ja) obj2).getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(fVar != null ? av.a(new StringBuilder(), fVar.mWho, ":") : BuildConfig.FLAVOR);
            this.D = activityResultRegistry.d(strConcat.concat("StartActivityForResult"), new u9(), new i());
            this.E = activityResultRegistry.d(strConcat.concat("StartIntentSenderForResult"), new C0020l(), new j());
            this.F = activityResultRegistry.d(strConcat.concat("RequestPermissions"), new s9(), new a());
        }
        Object obj3 = this.x;
        if (obj3 instanceof gh7) {
            ((gh7) obj3).addOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof hi7) {
            ((hi7) obj4).addOnTrimMemoryListener(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof rh7) {
            ((rh7) obj5).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof sh7) {
            ((sh7) obj6).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof jr6) && fVar == null) {
            ((jr6) obj7).addMenuProvider(this.v);
        }
    }

    public final androidx.fragment.app.f.n b0(androidx.fragment.app.f fVar) {
        androidx.fragment.app.p pVar = this.c.b.get(fVar.mWho);
        if (pVar != null) {
            androidx.fragment.app.f fVar2 = pVar.c;
            if (fVar2.equals(fVar)) {
                if (fVar2.mState > -1) {
                    return new androidx.fragment.app.f.n(pVar.n());
                }
                return null;
            }
        }
        k0(new IllegalStateException(xr1.b("Fragment ", fVar, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void c(androidx.fragment.app.f fVar) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + fVar);
        }
        if (fVar.mDetached) {
            fVar.mDetached = false;
            if (fVar.mAdded) {
                return;
            }
            this.c.a(fVar);
            if (M(2)) {
                Log.v("FragmentManager", "add from attach: " + fVar);
            }
            if (N(fVar)) {
                this.H = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.v.removeCallbacks(this.Q);
                    this.x.v.post(this.Q);
                    m0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void d0(androidx.fragment.app.f fVar, boolean z) {
        ViewGroup viewGroupI = I(fVar);
        if (viewGroupI == null || !(viewGroupI instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupI).setDrawDisappearingViewsLast(!z);
    }

    public final void e(String str) {
        o oVarRemove = this.n.remove(str);
        if (oVarRemove != null) {
            oVarRemove.t.c(oVarRemove.v);
        }
        if (M(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key ".concat(str));
        }
    }

    public final void e0(Bundle bundle, String str) {
        o oVar = this.n.get(str);
        if (oVar == null || oVar.t.b().compareTo(s66.b.w) < 0) {
            this.m.put(str, bundle);
        } else {
            oVar.d(bundle, str);
        }
        if (M(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final HashSet f() {
        Object cVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListD = this.c.d();
        int size = arrayListD.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListD.get(i2);
            i2++;
            ViewGroup viewGroup = ((androidx.fragment.app.p) obj).c.mContainer;
            if (viewGroup != null) {
                K().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof u) {
                    cVar = (u) tag;
                } else {
                    cVar = new androidx.fragment.app.c(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
                }
                hashSet.add(cVar);
            }
        }
        return hashSet;
    }

    public final void f0(String str, m76 m76Var, pf4 pf4Var) {
        s66 lifecycle = m76Var.getLifecycle();
        if (lifecycle.b() == s66.b.t) {
            return;
        }
        g gVar = new g(str, pf4Var, lifecycle);
        o oVarPut = this.n.put(str, new o(lifecycle, pf4Var, gVar));
        if (oVarPut != null) {
            oVarPut.t.c(oVarPut.v);
        }
        if (M(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + pf4Var);
        }
        lifecycle.a(gVar);
    }

    public final HashSet g(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            ArrayList<androidx.fragment.app.r.a> arrayList2 = ((androidx.fragment.app.a) arrayList.get(i2)).a;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                androidx.fragment.app.r.a aVar = arrayList2.get(i4);
                i4++;
                androidx.fragment.app.f fVar = aVar.b;
                if (fVar != null && (viewGroup = fVar.mContainer) != null) {
                    hashSet.add(u.i(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public final void g0(androidx.fragment.app.f fVar, s66.b bVar) {
        if (fVar.equals(this.c.b(fVar.mWho)) && (fVar.mHost == null || fVar.mFragmentManager == this)) {
            fVar.mMaxState = bVar;
        } else {
            f04.c("Fragment ", fVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final androidx.fragment.app.p h(androidx.fragment.app.f fVar) {
        String str = fVar.mWho;
        androidx.fragment.app.q qVar = this.c;
        androidx.fragment.app.p pVar = qVar.b.get(str);
        if (pVar != null) {
            return pVar;
        }
        androidx.fragment.app.p pVar2 = new androidx.fragment.app.p(this.p, qVar, fVar);
        pVar2.l(this.x.u.getClassLoader());
        pVar2.e = this.w;
        return pVar2;
    }

    public final void h0(androidx.fragment.app.f fVar) {
        if (fVar != null) {
            if (!fVar.equals(this.c.b(fVar.mWho)) || (fVar.mHost != null && fVar.mFragmentManager != this)) {
                f04.c("Fragment ", fVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        androidx.fragment.app.f fVar2 = this.A;
        this.A = fVar;
        s(fVar2);
        s(this.A);
    }

    public final void i(androidx.fragment.app.f fVar) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + fVar);
        }
        if (fVar.mDetached) {
            return;
        }
        fVar.mDetached = true;
        if (fVar.mAdded) {
            if (M(2)) {
                Log.v("FragmentManager", "remove from detach: " + fVar);
            }
            androidx.fragment.app.q qVar = this.c;
            synchronized (qVar.a) {
                qVar.a.remove(fVar);
            }
            fVar.mAdded = false;
            if (N(fVar)) {
                this.H = true;
            }
            i0(fVar);
        }
    }

    public final void i0(androidx.fragment.app.f fVar) {
        ViewGroup viewGroupI = I(fVar);
        if (viewGroupI != null) {
            if (fVar.getPopExitAnim() + fVar.getPopEnterAnim() + fVar.getExitAnim() + fVar.getEnterAnim() > 0) {
                if (viewGroupI.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupI.setTag(R.id.visible_removing_fragment_view_tag, fVar);
                }
                ((androidx.fragment.app.f) viewGroupI.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fVar.getPopDirection());
            }
        }
    }

    public final void j(boolean z, Configuration configuration) {
        if (z && (this.x instanceof gh7)) {
            k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null) {
                fVar.performConfigurationChanged(configuration);
                if (z) {
                    fVar.mChildFragmentManager.j(true, configuration);
                }
            }
        }
    }

    public final boolean k(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null && fVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void k0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new xd6());
        ue4<?> ue4Var = this.x;
        if (ue4Var != null) {
            try {
                ue4Var.d(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            w("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.f> arrayList = null;
        boolean z = false;
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null && fVar.isMenuVisible() && fVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fVar);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                androidx.fragment.app.f fVar2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l0(m mVar) {
        androidx.fragment.app.k kVar = this.p;
        kVar.getClass();
        mVar.getClass();
        synchronized (kVar.b) {
            try {
                int size = kVar.b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (kVar.b.get(i2).a == mVar) {
                        kVar.b.remove(i2);
                        break;
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        boolean zIsChangingConfigurations = true;
        this.K = true;
        A(true);
        x();
        ue4<?> ue4Var = this.x;
        boolean z = ue4Var instanceof whb;
        androidx.fragment.app.q qVar = this.c;
        if (z) {
            zIsChangingConfigurations = qVar.d.x;
        } else {
            androidx.fragment.app.g gVar = ue4Var.u;
            if (gVar != null) {
                zIsChangingConfigurations = true ^ gVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<wh0> it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = it.next().t;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    qVar.d.d((String) obj, false);
                }
            }
        }
        v(-1);
        Object obj2 = this.x;
        if (obj2 instanceof hi7) {
            ((hi7) obj2).removeOnTrimMemoryListener(this.s);
        }
        Object obj3 = this.x;
        if (obj3 instanceof gh7) {
            ((gh7) obj3).removeOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof rh7) {
            ((rh7) obj4).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj5 = this.x;
        if (obj5 instanceof sh7) {
            ((sh7) obj5).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj6 = this.x;
        if ((obj6 instanceof jr6) && this.z == null) {
            ((jr6) obj6).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.remove();
            this.g = null;
        }
        da daVar = this.D;
        if (daVar != null) {
            daVar.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void m0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.setEnabled(true);
                    if (M(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = H() > 0 && P(this.z);
                if (M(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.setEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(boolean z) {
        if (z && (this.x instanceof hi7)) {
            k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null) {
                fVar.performLowMemory();
                if (z) {
                    fVar.mChildFragmentManager.n(true);
                }
            }
        }
    }

    public final void o(boolean z, boolean z2) {
        if (z2 && (this.x instanceof rh7)) {
            k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null) {
                fVar.performMultiWindowModeChanged(z);
                if (z2) {
                    fVar.mChildFragmentManager.o(z, true);
                }
            }
        }
    }

    public final void p() {
        ArrayList arrayListE = this.c.e();
        int size = arrayListE.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListE.get(i2);
            i2++;
            androidx.fragment.app.f fVar = (androidx.fragment.app.f) obj;
            if (fVar != null) {
                fVar.onHiddenChanged(fVar.isHidden());
                fVar.mChildFragmentManager.p();
            }
        }
    }

    public final boolean q(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null && fVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null) {
                fVar.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void s(androidx.fragment.app.f fVar) {
        if (fVar != null) {
            if (fVar.equals(this.c.b(fVar.mWho))) {
                fVar.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void t(boolean z, boolean z2) {
        if (z2 && (this.x instanceof sh7)) {
            k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null) {
                fVar.performPictureInPictureModeChanged(z);
                if (z2) {
                    fVar.mChildFragmentManager.t(z, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.f fVar = this.z;
        if (fVar != null) {
            sb.append(fVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            ue4<?> ue4Var = this.x;
            if (ue4Var != null) {
                sb.append(ue4Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final boolean u(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (androidx.fragment.app.f fVar : this.c.f()) {
            if (fVar != null && fVar.isMenuVisible() && fVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void v(int i2) {
        try {
            this.b = true;
            for (androidx.fragment.app.p pVar : this.c.b.values()) {
                if (pVar != null) {
                    pVar.e = i2;
                }
            }
            R(i2, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((u) it.next()).h();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strD = al.d(str, "    ");
        androidx.fragment.app.q qVar = this.c;
        ArrayList<androidx.fragment.app.f> arrayList = qVar.a;
        String strD2 = al.d(str, "    ");
        HashMap<String, androidx.fragment.app.p> map = qVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.p pVar : map.values()) {
                printWriter.print(str);
                if (pVar != null) {
                    androidx.fragment.app.f fVar = pVar.c;
                    printWriter.println(fVar);
                    fVar.dump(strD2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.fragment.app.f fVar2 = arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fVar2.toString());
            }
        }
        ArrayList<androidx.fragment.app.f> arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.f fVar3 = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(strD, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (q) this.a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((u) it.next()).h();
        }
    }

    public final void y(q qVar, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.K) {
                    aa0.c("FragmentManager has been destroyed");
                    return;
                } else {
                    aa0.c("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (Q()) {
                aa0.c("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(qVar);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            aa0.c("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.K) {
                aa0.c("FragmentManager has been destroyed");
                return;
            } else {
                aa0.c("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.v.getLooper()) {
            aa0.c("Must be called from main thread of fragment host");
            return;
        }
        if (!z && Q()) {
            aa0.c("Can not perform this action after onSaveInstanceState");
        } else if (this.M == null) {
            this.M = new ArrayList<>();
            this.N = new ArrayList<>();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class m {
        public void a(androidx.fragment.app.f fVar) {
        }

        public void b(androidx.fragment.app.f fVar) {
        }

        public void c(l lVar, androidx.fragment.app.f fVar, View view) {
        }
    }
}
