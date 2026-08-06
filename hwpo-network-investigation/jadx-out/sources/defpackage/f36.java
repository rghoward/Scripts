package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.l;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderEvents;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;
import com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowFragment;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f36 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ f36(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) throws Throwable {
        Bundle bundle;
        Bundle[] bundleArr;
        Throwable th;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment = (LeaderboardDetailsHeaderFragment) obj2;
                gm3 gm3Var = (gm3) obj;
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof LeaderboardDetailsHeaderEvents.ShowError) {
                    leaderboardDetailsHeaderFragment.m(((LeaderboardDetailsHeaderEvents.ShowError) gm3Var).b);
                } else if (gm3Var instanceof LeaderboardDetailsHeaderEvents.ShowFiltersDialog) {
                    LeaderboardDetailsFiltersFlowFragment.Companion.getClass();
                    LeaderboardDetailsFiltersFlowFragment leaderboardDetailsFiltersFlowFragment = new LeaderboardDetailsFiltersFlowFragment();
                    l childFragmentManager = leaderboardDetailsHeaderFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    leaderboardDetailsFiltersFlowFragment.s(childFragmentManager);
                }
                return g2b.a;
            default:
                Bundle bundle2 = (Bundle) obj;
                o67 o67VarC = oj5.c((Context) obj2);
                if (bundle2 != null) {
                    bundle2.setClassLoader(o67VarC.a.getClassLoader());
                }
                q57 q57Var = o67VarC.b;
                LinkedHashMap linkedHashMap = q57Var.m;
                Throwable th2 = null;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            xx.e("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    q57Var.d = bundle;
                    if (bundle2.containsKey("android-support-nav:controller:backStack")) {
                        ArrayList arrayListB = Build.VERSION.SDK_INT >= 34 ? ty0.a.b(bundle2, "android-support-nav:controller:backStack", me3.b(ll8.a(Bundle.class))) : bundle2.getParcelableArrayList("android-support-nav:controller:backStack");
                        if (arrayListB == null) {
                            xx.e("android-support-nav:controller:backStack");
                            throw null;
                        }
                        bundleArr = (Bundle[]) arrayListB.toArray(new Bundle[0]);
                    } else {
                        bundleArr = null;
                    }
                    q57Var.e = bundleArr;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            xx.e("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            xx.e("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = i3 + 1;
                            Throwable th3 = th2;
                            q57Var.l.put(Integer.valueOf(intArray[i2]), !xj5.a(stringArrayList.get(i3), BuildConfig.FLAVOR) ? (String) stringArrayList.get(i3) : th3);
                            i2++;
                            th2 = th3;
                            i3 = i4;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            xx.e("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            String str = stringArrayList2.get(i5);
                            i5++;
                            String str2 = str;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                String strA = ct1.a("android-support-nav:controller:backStackStates:", str2);
                                ArrayList arrayListB2 = Build.VERSION.SDK_INT >= 34 ? ty0.a.b(bundle2, strA, me3.b(ll8.a(Bundle.class))) : bundle2.getParcelableArrayList(strA);
                                if (arrayListB2 == null) {
                                    xx.e(strA);
                                    throw th;
                                }
                                h30 h30Var = new h30(arrayListB2.size());
                                int size2 = arrayListB2.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    Object obj3 = arrayListB2.get(i6);
                                    i6++;
                                    h30Var.addLast(new z47((Bundle) obj3));
                                }
                                linkedHashMap.put(str2, h30Var);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : th;
                    o67VarC.e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
                }
                return o67VarC;
        }
    }
}
