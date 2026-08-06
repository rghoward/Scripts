package com.hwpo_training_app.notifications.data.network.push;

import defpackage.ll8;
import defpackage.yl5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationModuleSerializer extends yl5<NotificationNetworkEntity> {
    public static final NotificationModuleSerializer c = new NotificationModuleSerializer();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[NotificationTypeNetworkEntity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NotificationTypeNetworkEntity.Companion companion = NotificationTypeNetworkEntity.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                NotificationTypeNetworkEntity.Companion companion2 = NotificationTypeNetworkEntity.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NotificationModuleSerializer() {
        super(ll8.a(NotificationNetworkEntity.class));
    }
}
