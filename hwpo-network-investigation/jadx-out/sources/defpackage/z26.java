package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z26 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ z26(int i) {
        this.t = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        String str;
        switch (this.t) {
            case 0:
                int i = LeaderboardDetailsFiltersViewModel.J;
                return Boolean.valueOf(((LeaderboardDetailsFiltersViewState) obj).e);
            case 1:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            default:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                au3 au3Var = t29.a;
                Boolean bool = Boolean.FALSE;
                iw iwVar = (xj5.a(obj2, bool) || obj2 == null) ? null : (iw) ((oh4) au3Var.u).invoke(obj2);
                iwVar.getClass();
                Object obj3 = list.get(1);
                int i3 = lja.c;
                lja ljaVar = (xj5.a(obj3, bool) || obj3 == null) ? null : (lja) ((oh4) t29.p.u).invoke(obj3);
                ljaVar.getClass();
                return new kha(iwVar, ljaVar.a, (lja) null);
        }
    }
}
