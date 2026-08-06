package com.hwpo_training_app.notifications.presentation;

import com.hwpo_training_app.notifications.domain.entity.LeaderboardScoreModel;
import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity;
import defpackage.a3a;
import defpackage.bl0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.pi4;
import defpackage.ps6;
import defpackage.r02;
import defpackage.rhb;
import defpackage.u;
import defpackage.xd3;
import defpackage.xm2;
import defpackage.yd3;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notifications.presentation.NotificationsViewModel$observeNotifications$1", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class NotificationsViewModel$observeNotifications$1 extends p6a implements ci4<xd3<? extends Exception, ? extends List<? extends NotificationModel>>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ NotificationsViewModel u;

    /* JADX INFO: renamed from: com.hwpo_training_app.notifications.presentation.NotificationsViewModel$observeNotifications$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass1 extends pi4 implements oh4<List<? extends NotificationModel>, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(List<? extends NotificationModel> list) {
            bl0 notificationsListLoaded;
            NotificationUiEntity clientBonusPlanRemind;
            List<? extends NotificationModel> list2 = list;
            list2.getClass();
            NotificationsViewModel notificationsViewModel = (NotificationsViewModel) this.receiver;
            NotificationsViewModel.Companion companion = NotificationsViewModel.Companion;
            notificationsViewModel.getClass();
            if (list2.isEmpty()) {
                notificationsListLoaded = NotificationsViewModel.Action.ShowNoResultsPlaceHolder.a;
            } else {
                DateTimeFormatter dateTimeFormatterWithLocale = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
                ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
                for (NotificationModel notificationModel : list2) {
                    dateTimeFormatterWithLocale.getClass();
                    if (notificationModel instanceof NotificationModel.LeaderboardCommentCreated) {
                        NotificationModel.LeaderboardCommentCreated leaderboardCommentCreated = (NotificationModel.LeaderboardCommentCreated) notificationModel;
                        LeaderboardScoreModel leaderboardScoreModel = leaderboardCommentCreated.j;
                        Integer num = leaderboardScoreModel.b;
                        String str = leaderboardCommentCreated.d;
                        ps6 ps6Var = leaderboardCommentCreated.g;
                        String str2 = ps6Var.b;
                        LocalDateTime localDateTime = leaderboardCommentCreated.e;
                        long j = leaderboardCommentCreated.b;
                        boolean z = leaderboardCommentCreated.f;
                        if (num != null) {
                            String str3 = localDateTime.format(dateTimeFormatterWithLocale);
                            str3.getClass();
                            clientBonusPlanRemind = new NotificationUiEntity.LeaderboardValueCommentCreated(j, z, str3, str2, ps6Var.e, String.valueOf(a3a.S(str2)), rhb.c(str), leaderboardScoreModel.c, num.intValue());
                        } else {
                            String str4 = localDateTime.format(dateTimeFormatterWithLocale);
                            str4.getClass();
                            clientBonusPlanRemind = new NotificationUiEntity.LeaderboardCommentCreated(j, z, str4, str2, ps6Var.e, String.valueOf(a3a.S(str2)), rhb.c(str), leaderboardScoreModel.c);
                        }
                    } else if (notificationModel instanceof NotificationModel.LeaderboardCommentMentioned) {
                        NotificationModel.LeaderboardCommentMentioned leaderboardCommentMentioned = (NotificationModel.LeaderboardCommentMentioned) notificationModel;
                        LeaderboardScoreModel leaderboardScoreModel2 = leaderboardCommentMentioned.j;
                        Integer num2 = leaderboardScoreModel2.b;
                        String str5 = leaderboardCommentMentioned.d;
                        ps6 ps6Var2 = leaderboardCommentMentioned.g;
                        String str6 = ps6Var2.b;
                        LocalDateTime localDateTime2 = leaderboardCommentMentioned.e;
                        long j2 = leaderboardCommentMentioned.b;
                        boolean z2 = leaderboardCommentMentioned.f;
                        if (num2 != null) {
                            String str7 = localDateTime2.format(dateTimeFormatterWithLocale);
                            str7.getClass();
                            clientBonusPlanRemind = new NotificationUiEntity.LeaderboardValueCommentCreated(j2, z2, str7, str6, ps6Var2.e, String.valueOf(a3a.S(str6)), rhb.c(str5), leaderboardScoreModel2.c, num2.intValue());
                        } else {
                            String str8 = localDateTime2.format(dateTimeFormatterWithLocale);
                            str8.getClass();
                            clientBonusPlanRemind = new NotificationUiEntity.LeaderboardCommentCreated(j2, z2, str8, str6, ps6Var2.e, String.valueOf(a3a.S(str6)), rhb.c(str5), leaderboardScoreModel2.c);
                        }
                    } else {
                        if (!(notificationModel instanceof NotificationModel.ClientBonusPlanRemind)) {
                            u.b();
                            return null;
                        }
                        NotificationModel.ClientBonusPlanRemind clientBonusPlanRemind2 = (NotificationModel.ClientBonusPlanRemind) notificationModel;
                        long j3 = clientBonusPlanRemind2.b;
                        boolean z3 = clientBonusPlanRemind2.f;
                        String str9 = clientBonusPlanRemind2.e.format(dateTimeFormatterWithLocale);
                        str9.getClass();
                        ps6 ps6Var3 = clientBonusPlanRemind2.g;
                        String str10 = ps6Var3.b;
                        clientBonusPlanRemind = new NotificationUiEntity.ClientBonusPlanRemind(j3, z3, str9, str10, ps6Var3.e, String.valueOf(a3a.S(str10)), rhb.c(clientBonusPlanRemind2.d));
                    }
                    arrayList.add(clientBonusPlanRemind);
                }
                notificationsListLoaded = new NotificationsViewModel.Action.NotificationsListLoaded(arrayList);
            }
            notificationsViewModel.e(notificationsListLoaded);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$observeNotifications$1(NotificationsViewModel notificationsViewModel, r02<? super NotificationsViewModel$observeNotifications$1> r02Var) {
        super(2, r02Var);
        this.u = notificationsViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        NotificationsViewModel$observeNotifications$1 notificationsViewModel$observeNotifications$1 = new NotificationsViewModel$observeNotifications$1(this.u, r02Var);
        notificationsViewModel$observeNotifications$1.t = obj;
        return notificationsViewModel$observeNotifications$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends List<? extends NotificationModel>> xd3Var, r02<? super g2b> r02Var) {
        return ((NotificationsViewModel$observeNotifications$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        yd3.h(xd3Var, new AnonymousClass1(1, this.u, NotificationsViewModel.class, "onNotificationsLoaded", "onNotificationsLoaded(Ljava/util/List;)V", 0));
        return g2b.a;
    }
}
