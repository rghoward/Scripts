package com.hwpo_training_app.leaderboards.list.common.data.storage;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage;
import defpackage.a0a;
import defpackage.b0a;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.li8;
import defpackage.th1;
import defpackage.yk2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardsStorageImpl implements LeaderboardsStorage {
    public final ConcurrentHashMap<LeaderboardType, Integer> a = new ConcurrentHashMap<>();
    public final a0a b;
    public final li8 c;

    public LeaderboardsStorageImpl() {
        a0a a0aVarB = b0a.b(hf3.t);
        this.b = a0aVarB;
        this.c = yk2.b(a0aVarB);
    }

    @Override // com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage
    public final li8 a() {
        return this.c;
    }

    @Override // com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage
    public final g2b b(List list) {
        a0a a0aVar = this.b;
        ArrayList arrayListU = th1.U((Collection) a0aVar.getValue());
        arrayListU.addAll(list);
        a0aVar.getClass();
        a0aVar.l(null, arrayListU);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage
    public final Integer c(LeaderboardType leaderboardType) {
        leaderboardType.getClass();
        return this.a.get(leaderboardType);
    }

    @Override // com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage
    public final g2b clear() {
        this.a.clear();
        a0a a0aVar = this.b;
        a0aVar.getClass();
        a0aVar.l(null, hf3.t);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage
    public final void d(LeaderboardType leaderboardType, Integer num) {
        leaderboardType.getClass();
        this.a.put(leaderboardType, num);
    }

    @Override // com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage
    public final g2b e(LeaderboardType leaderboardType, List list) {
        a0a a0aVar = this.b;
        Iterable iterable = (Iterable) a0aVar.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((LeaderboardModel) obj).d != leaderboardType) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.addAll(list);
        a0aVar.getClass();
        a0aVar.l(null, arrayList2);
        return g2b.a;
    }
}
