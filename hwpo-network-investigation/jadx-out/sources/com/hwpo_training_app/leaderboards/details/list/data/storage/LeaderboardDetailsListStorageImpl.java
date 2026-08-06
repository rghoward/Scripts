package com.hwpo_training_app.leaderboards.details.list.data.storage;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage;
import defpackage.a0a;
import defpackage.b0a;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.j36;
import defpackage.th1;
import defpackage.y31;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsListStorageImpl implements LeaderboardDetailsListStorage {
    public final ConcurrentHashMap<TopValueKind, Integer> a = new ConcurrentHashMap<>();
    public final a0a b;
    public final a0a c;

    public LeaderboardDetailsListStorageImpl() {
        a0a a0aVarB = b0a.b(hf3.t);
        this.b = a0aVarB;
        this.c = a0aVarB;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage
    public final g2b a(TopValueKind topValueKind, List list, LeaderboardTopValueModel leaderboardTopValueModel) {
        a0a a0aVar = this.b;
        Iterable iterable = (Iterable) a0aVar.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((LeaderboardTopValueModel) obj).i != topValueKind) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.addAll(list);
        if (leaderboardTopValueModel != null) {
            if (arrayList2.isEmpty()) {
                arrayList2.add(leaderboardTopValueModel);
            } else {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    if (((LeaderboardTopValueModel) obj2).a == leaderboardTopValueModel.a) {
                    }
                }
                arrayList2.add(leaderboardTopValueModel);
            }
        }
        a0aVar.getClass();
        a0aVar.l(null, arrayList2);
        return g2b.a;
    }

    @Override // defpackage.qe1
    public final void clear() {
        this.a.clear();
        a0a a0aVar = this.b;
        a0aVar.getClass();
        a0aVar.l(null, hf3.t);
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage
    public final g2b d(int i, boolean z) {
        a0a a0aVar = this.b;
        ArrayList arrayListU = th1.U((Collection) a0aVar.getValue());
        int size = arrayListU.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i2 = -1;
                break;
            }
            Object obj = arrayListU.get(i3);
            i3++;
            if (((LeaderboardTopValueModel) obj).a == i) {
                break;
            }
            i2++;
        }
        LeaderboardTopValueModel leaderboardTopValueModel = (LeaderboardTopValueModel) arrayListU.get(i2);
        arrayListU.set(i2, LeaderboardTopValueModel.a(leaderboardTopValueModel, false, leaderboardTopValueModel.f + (z ? 1 : -1), null, z, 114655));
        a0aVar.getClass();
        a0aVar.l(null, arrayListU);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage
    public final g2b h(int i, boolean z) {
        a0a a0aVar = this.b;
        ArrayList arrayListU = th1.U((Collection) a0aVar.getValue());
        int size = arrayListU.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListU.get(i3);
            i3++;
            if (((LeaderboardTopValueModel) obj).a == i) {
                arrayListU.set(i2, LeaderboardTopValueModel.a((LeaderboardTopValueModel) arrayListU.get(i2), z, 0, null, false, 131067));
                a0aVar.getClass();
                a0aVar.l(null, arrayListU);
                return g2b.a;
            }
            i2++;
        }
        i2 = -1;
        arrayListU.set(i2, LeaderboardTopValueModel.a((LeaderboardTopValueModel) arrayListU.get(i2), z, 0, null, false, 131067));
        a0aVar.getClass();
        a0aVar.l(null, arrayListU);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage
    public final g2b i(List list, LeaderboardTopValueModel leaderboardTopValueModel) {
        boolean z;
        boolean z2;
        a0a a0aVar = this.b;
        ArrayList arrayListU = th1.U((Collection) a0aVar.getValue());
        boolean z3 = false;
        if (leaderboardTopValueModel != null) {
            int i = leaderboardTopValueModel.a;
            if (!arrayListU.isEmpty()) {
                int size = arrayListU.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    Object obj = arrayListU.get(i2);
                    i2++;
                    if (((LeaderboardTopValueModel) obj).a == i) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (list != null && list.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((LeaderboardTopValueModel) it.next()).a == i) {
                    z2 = true;
                    break;
                }
            }
            if (z && z2) {
                final y31 y31Var = new y31(2, leaderboardTopValueModel);
                arrayListU.removeIf(new Predicate() { // from class: i36
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((Boolean) y31Var.invoke(obj2)).booleanValue();
                    }
                });
            } else if (z && !z2) {
                final j36 j36Var = new j36(leaderboardTopValueModel);
                arrayListU.removeIf(new Predicate() { // from class: k36
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((Boolean) j36Var.invoke(obj2)).booleanValue();
                    }
                });
                z3 = true;
            }
        }
        arrayListU.addAll(list);
        if (z3 && !arrayListU.isEmpty() && leaderboardTopValueModel != null) {
            arrayListU.add(leaderboardTopValueModel);
        }
        List listN = th1.N(arrayListU, new Comparator() { // from class: com.hwpo_training_app.leaderboards.details.list.data.storage.LeaderboardDetailsListStorageImpl$addTopValues$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Integer num = ((LeaderboardTopValueModel) t).b;
                Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = ((LeaderboardTopValueModel) t2).b;
                return eo7.f(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            }
        });
        a0aVar.getClass();
        a0aVar.l(null, listN);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage
    public final Integer k(TopValueKind topValueKind) {
        topValueKind.getClass();
        return this.a.get(topValueKind);
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage
    public final void l(TopValueKind topValueKind, Integer num) {
        topValueKind.getClass();
        this.a.put(topValueKind, num);
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage
    public final a0a m() {
        return this.c;
    }
}
