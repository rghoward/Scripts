package com.hwpo_training_app.notifications.data;

import com.hwpo_training_app.notifications.domain.NotificationsStorage;
import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import defpackage.a0a;
import defpackage.b0a;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.j74;
import defpackage.ph1;
import defpackage.u;
import defpackage.yk2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsStorageImpl implements NotificationsStorage {
    public final a0a a;
    public final j74 b;
    public Long c;

    public NotificationsStorageImpl() {
        a0a a0aVarB = b0a.b(null);
        this.a = a0aVarB;
        this.b = new j74(yk2.b(a0aVarB));
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final j74 a() {
        return this.b;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final Long b() {
        return this.c;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final g2b c(List list) {
        a0a a0aVar = this.a;
        a0aVar.getClass();
        a0aVar.l(null, list);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final g2b clear() {
        this.c = null;
        this.a.setValue(null);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final void d(Long l) {
        this.c = l;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final g2b e(List list) {
        NotificationModel clientBonusPlanRemind;
        a0a a0aVar = this.a;
        Iterable<NotificationModel> iterable = (List) a0aVar.getValue();
        if (iterable == null) {
            iterable = hf3.t;
        }
        ArrayList arrayList = new ArrayList(ph1.n(iterable, 10));
        for (NotificationModel notificationModel : iterable) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).longValue() == notificationModel.a()) {
                        if (notificationModel instanceof NotificationModel.LeaderboardCommentCreated) {
                            NotificationModel.LeaderboardCommentCreated leaderboardCommentCreated = (NotificationModel.LeaderboardCommentCreated) notificationModel;
                            clientBonusPlanRemind = new NotificationModel.LeaderboardCommentCreated(leaderboardCommentCreated.b, leaderboardCommentCreated.c, leaderboardCommentCreated.d, leaderboardCommentCreated.e, true, leaderboardCommentCreated.g, leaderboardCommentCreated.h, leaderboardCommentCreated.i, leaderboardCommentCreated.j);
                        } else if (notificationModel instanceof NotificationModel.LeaderboardCommentMentioned) {
                            NotificationModel.LeaderboardCommentMentioned leaderboardCommentMentioned = (NotificationModel.LeaderboardCommentMentioned) notificationModel;
                            clientBonusPlanRemind = new NotificationModel.LeaderboardCommentMentioned(leaderboardCommentMentioned.b, leaderboardCommentMentioned.c, leaderboardCommentMentioned.d, leaderboardCommentMentioned.e, true, leaderboardCommentMentioned.g, leaderboardCommentMentioned.h, leaderboardCommentMentioned.i, leaderboardCommentMentioned.j);
                        } else {
                            if (!(notificationModel instanceof NotificationModel.ClientBonusPlanRemind)) {
                                u.b();
                                return null;
                            }
                            NotificationModel.ClientBonusPlanRemind clientBonusPlanRemind2 = (NotificationModel.ClientBonusPlanRemind) notificationModel;
                            clientBonusPlanRemind = new NotificationModel.ClientBonusPlanRemind(clientBonusPlanRemind2.b, clientBonusPlanRemind2.c, clientBonusPlanRemind2.d, clientBonusPlanRemind2.e, true, clientBonusPlanRemind2.g, clientBonusPlanRemind2.h);
                        }
                        notificationModel = clientBonusPlanRemind;
                        break;
                    }
                }
            }
            arrayList.add(notificationModel);
        }
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final g2b f(List list) {
        a0a a0aVar = this.a;
        Collection collection = (List) a0aVar.getValue();
        if (collection == null) {
            collection = hf3.t;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.addAll(list);
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
        return g2b.a;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsStorage
    public final g2b g(NotificationModel notificationModel) {
        a0a a0aVar = this.a;
        Collection collection = (List) a0aVar.getValue();
        if (collection == null) {
            collection = hf3.t;
        }
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((NotificationModel) obj).a() == notificationModel.a()) {
                break;
            }
            i++;
        }
        if (i == -1) {
            arrayList.add(0, notificationModel);
        } else {
            arrayList.set(i, notificationModel);
        }
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
        return g2b.a;
    }
}
