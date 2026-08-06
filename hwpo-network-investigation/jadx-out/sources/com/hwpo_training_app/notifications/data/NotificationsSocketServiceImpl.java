package com.hwpo_training_app.notifications.data;

import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import com.hwpo_training_app.notifications.data.network.response.ReadNotificationsNetworkEntity;
import com.hwpo_training_app.notifications.data.network.response.SocketNotificationTypeNetworkEntity;
import com.hwpo_training_app.notifications.domain.NotificationsSocketService;
import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import com.hwpo_training_app.notifications.domain.entity.ReadNotifications;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.hm5;
import defpackage.j74;
import defpackage.ji8;
import defpackage.nm5;
import defpackage.r02;
import defpackage.r54;
import defpackage.s54;
import defpackage.sl5;
import defpackage.tv9;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.z90;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsSocketServiceImpl implements NotificationsSocketService {
    public final sl5 a;
    public final j74 b;
    public final j74 c;

    public NotificationsSocketServiceImpl(tv9 tv9Var, sl5 sl5Var) {
        tv9Var.getClass();
        sl5Var.getClass();
        this.a = sl5Var;
        final ji8 ji8Var = tv9Var.A;
        this.b = new j74(new r54<NotificationModel>() { // from class: com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                public final /* synthetic */ s54 t;
                public final /* synthetic */ NotificationsSocketServiceImpl u;

                /* JADX INFO: renamed from: com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @xm2(c = "com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$1$2", f = "NotificationsSocketServiceImpl.kt", l = {217}, m = "emit", v = 2)
                public static final class AnonymousClass1 extends u02 {
                    public /* synthetic */ Object t;
                    public int u;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.t = obj;
                        this.u |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var, NotificationsSocketServiceImpl notificationsSocketServiceImpl) {
                    this.t = s54Var;
                    this.u = notificationsSocketServiceImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    JsonElement jsonElement;
                    SocketNotificationTypeNetworkEntity socketNotificationTypeNetworkEntity;
                    sl5 sl5Var = this.u.a;
                    if (r02Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) r02Var;
                        int i = anonymousClass1.u;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.u = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(r02Var);
                    }
                    Object obj2 = anonymousClass1.t;
                    int i2 = anonymousClass1.u;
                    NotificationModel notificationModelA = null;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        String str = (String) obj;
                        sl5Var.getClass();
                        str.getClass();
                        JsonElement jsonElement2 = (JsonElement) hm5.b((JsonElement) sl5Var.b(nm5.a, str)).get(MetricTracker.Object.MESSAGE);
                        if ((jsonElement2 instanceof JsonObject) && (jsonElement = (JsonElement) hm5.b(jsonElement2).get("data")) != null) {
                            Object obj3 = hm5.b(jsonElement2).get("type");
                            if (obj3 == null) {
                                z90.a("Required value was null.");
                                return null;
                            }
                            String strD = hm5.c((JsonElement) obj3).d();
                            SocketNotificationTypeNetworkEntity.Companion.getClass();
                            strD.getClass();
                            SocketNotificationTypeNetworkEntity[] socketNotificationTypeNetworkEntityArrValues = SocketNotificationTypeNetworkEntity.values();
                            int length = socketNotificationTypeNetworkEntityArrValues.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    socketNotificationTypeNetworkEntity = null;
                                    break;
                                }
                                socketNotificationTypeNetworkEntity = socketNotificationTypeNetworkEntityArrValues[i3];
                                if (socketNotificationTypeNetworkEntity.t.equals(strD)) {
                                    break;
                                }
                                i3++;
                            }
                            if (socketNotificationTypeNetworkEntity == SocketNotificationTypeNetworkEntity.NEW_NOTIFICATION) {
                                notificationModelA = ((NotificationNetworkEntity) sl5Var.a(NotificationNetworkEntity.Companion.serializer(), jsonElement)).a();
                            }
                        }
                        anonymousClass1.u = 1;
                        Object objEmit = this.t.emit(notificationModelA, anonymousClass1);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj2);
                    }
                    return g2b.a;
                }
            }

            @Override // defpackage.r54
            public final Object collect(s54<? super NotificationModel> s54Var, r02 r02Var) {
                Object objCollect = ji8Var.collect(new AnonymousClass2(s54Var, this), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        });
        this.c = new j74(new r54<ReadNotifications>() { // from class: com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                public final /* synthetic */ s54 t;
                public final /* synthetic */ NotificationsSocketServiceImpl u;

                /* JADX INFO: renamed from: com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @xm2(c = "com.hwpo_training_app.notifications.data.NotificationsSocketServiceImpl$special$$inlined$map$2$2", f = "NotificationsSocketServiceImpl.kt", l = {217}, m = "emit", v = 2)
                public static final class AnonymousClass1 extends u02 {
                    public /* synthetic */ Object t;
                    public int u;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.t = obj;
                        this.u |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var, NotificationsSocketServiceImpl notificationsSocketServiceImpl) {
                    this.t = s54Var;
                    this.u = notificationsSocketServiceImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    JsonElement jsonElement;
                    SocketNotificationTypeNetworkEntity socketNotificationTypeNetworkEntity;
                    sl5 sl5Var = this.u.a;
                    if (r02Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) r02Var;
                        int i = anonymousClass1.u;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.u = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(r02Var);
                    }
                    Object obj2 = anonymousClass1.t;
                    int i2 = anonymousClass1.u;
                    ReadNotifications readNotifications = null;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        String str = (String) obj;
                        sl5Var.getClass();
                        str.getClass();
                        JsonElement jsonElement2 = (JsonElement) hm5.b((JsonElement) sl5Var.b(nm5.a, str)).get(MetricTracker.Object.MESSAGE);
                        if ((jsonElement2 instanceof JsonObject) && (jsonElement = (JsonElement) hm5.b(jsonElement2).get("data")) != null) {
                            Object obj3 = hm5.b(jsonElement2).get("type");
                            if (obj3 == null) {
                                z90.a("Required value was null.");
                                return null;
                            }
                            String strD = hm5.c((JsonElement) obj3).d();
                            SocketNotificationTypeNetworkEntity.Companion.getClass();
                            strD.getClass();
                            SocketNotificationTypeNetworkEntity[] socketNotificationTypeNetworkEntityArrValues = SocketNotificationTypeNetworkEntity.values();
                            int length = socketNotificationTypeNetworkEntityArrValues.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    socketNotificationTypeNetworkEntity = null;
                                    break;
                                }
                                socketNotificationTypeNetworkEntity = socketNotificationTypeNetworkEntityArrValues[i3];
                                if (socketNotificationTypeNetworkEntity.t.equals(strD)) {
                                    break;
                                }
                                i3++;
                            }
                            if (socketNotificationTypeNetworkEntity == SocketNotificationTypeNetworkEntity.READ_NOTIFICATIONS) {
                                readNotifications = new ReadNotifications(((ReadNotificationsNetworkEntity) sl5Var.a(ReadNotificationsNetworkEntity.Companion.serializer(), jsonElement)).t);
                            }
                        }
                        anonymousClass1.u = 1;
                        Object objEmit = this.t.emit(readNotifications, anonymousClass1);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj2);
                    }
                    return g2b.a;
                }
            }

            @Override // defpackage.r54
            public final Object collect(s54<? super ReadNotifications> s54Var, r02 r02Var) {
                Object objCollect = ji8Var.collect(new AnonymousClass2(s54Var, this), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        });
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsSocketService
    public final j74 a() {
        return this.b;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsSocketService
    public final j74 b() {
        return this.c;
    }
}
