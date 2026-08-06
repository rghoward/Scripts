package com.hwpo_training_app.leaderboards.attachments.presentation;

import com.intercom.twig.BuildConfig;
import defpackage.a46;
import defpackage.atb;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.ph1;
import defpackage.pi4;
import defpackage.u60;
import defpackage.w60;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LeaderboardValueAttachmentsFragment$adapter$2$4 extends pi4 implements ci4<w60.b, List<? extends w60>, g2b> {
    @Override // defpackage.ci4
    public final g2b invoke(w60.b bVar, List<? extends w60> list) {
        w60.b bVar2 = bVar;
        List<? extends w60> list2 = list;
        bVar2.getClass();
        list2.getClass();
        LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel = (LeaderboardValueAttachmentsViewModel) this.receiver;
        a46 a46Var = leaderboardValueAttachmentsViewModel.x;
        String str = bVar2.f;
        int iOrdinal = bVar2.c.ordinal();
        if (iOrdinal == 0) {
            String str2 = bVar2.h;
            if (str2 != null) {
                leaderboardValueAttachmentsViewModel.f(new atb(str2));
            }
        } else if (iOrdinal == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof w60.b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (((w60.b) obj2).c == u60.u) {
                    arrayList2.add(obj2);
                }
            }
            int i2 = -1;
            if (arrayList2.indexOf(bVar2) != -1) {
                int size2 = arrayList2.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    if (((w60.b) obj3).b == bVar2.b) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                ArrayList arrayList3 = new ArrayList(ph1.n(arrayList2, 10));
                int size3 = arrayList2.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj4 = arrayList2.get(i5);
                    i5++;
                    String str3 = ((w60.b) obj4).g;
                    if (str3 == null) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    arrayList3.add(str3);
                }
                a46Var.f((String[]) arrayList3.toArray(new String[0]), i2);
            }
        } else if (iOrdinal != 2) {
            leaderboardValueAttachmentsViewModel.f(new LeaderboardValueAttachmentsEvents.OpenUrl(str));
        } else {
            a46Var.u(str);
        }
        return g2b.a;
    }
}
