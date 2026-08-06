package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$SearchBrowseCardKt {
    public static final ComposableSingletons$SearchBrowseCardKt INSTANCE = new ComposableSingletons$SearchBrowseCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f57lambda1 = new fr1(false, 1563709076, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, ws0.i(new SuggestedArticle(BuildConfig.FLAVOR, "How to restart recording", BuildConfig.FLAVOR), new SuggestedArticle(BuildConfig.FLAVOR, "How to track your recording time", BuildConfig.FLAVOR), new SuggestedArticle(BuildConfig.FLAVOR, "How to correct your transcript", BuildConfig.FLAVOR)));
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "PR");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate3.getClass();
            List listI = ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            metricTracker.getClass();
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listI, true, metricTracker, jt1Var, 3120);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f58lambda2 = new fr1(false, -1740562678, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, hf3.t);
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "PR");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate3.getClass();
            List listI = ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            metricTracker.getClass();
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listI, true, metricTracker, jt1Var, 3120);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f59lambda3 = new fr1(false, 130670641, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, ws0.i(new SuggestedArticle(BuildConfig.FLAVOR, "How to restart recording", BuildConfig.FLAVOR), new SuggestedArticle(BuildConfig.FLAVOR, "How to track your recording time", BuildConfig.FLAVOR), new SuggestedArticle(BuildConfig.FLAVOR, "How to correct your transcript", BuildConfig.FLAVOR)));
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "PR");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate3.getClass();
            List listI = ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            metricTracker.getClass();
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listI, true, metricTracker, jt1Var, 3120);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f60lambda4 = new fr1(false, 1883897723, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-4$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, hf3.t);
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "PR");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate3.getClass();
            List listI = ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            metricTracker.getClass();
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listI, true, metricTracker, jt1Var, 3120);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m70getLambda1$intercom_sdk_base_release() {
        return f57lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m71getLambda2$intercom_sdk_base_release() {
        return f58lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m72getLambda3$intercom_sdk_base_release() {
        return f59lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m73getLambda4$intercom_sdk_base_release() {
        return f60lambda4;
    }
}
