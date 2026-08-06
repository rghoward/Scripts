package io.intercom.android.sdk.m5.home.reducers;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.js7;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.th1;
import defpackage.u;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.ws0;
import defpackage.z2a;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HeaderBackdropType;
import io.intercom.android.sdk.models.HeaderBackgroundModel;
import io.intercom.android.sdk.models.HeaderConfig;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeHeaderStateReducerKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderBackdropType.values().length];
            try {
                iArr[HeaderBackdropType.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeaderBackdropType.COLORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HeaderBackdropType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0440 A[LOOP:0: B:34:0x043a->B:36:0x0440, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final HomeUiState.Content.ContentHeader computeContentHeader(ConfigModules configModules, TeamPresence teamPresence, boolean z) {
        js7 js7Var;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor2;
        HeaderConfig header;
        boolean z2;
        ArrayList arrayList;
        String logoDarkUrl;
        teamPresence.getClass();
        qq2 qq2Var = null;
        boolean z3 = false;
        if (configModules == null) {
            return new HomeUiState.Content.ContentHeader(false, null, null, new HomeUiState.Content.ContentHeader.ColoredText(BuildConfig.FLAVOR, 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null), new HomeUiState.Content.ContentHeader.ColoredText(BuildConfig.FLAVOR, 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(uh1.b, z3, qq2Var), null, false, hf3.t, new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 68, null);
        }
        HeaderBackdropType type = configModules.getHome().getHeader().getBackground().getType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[type.ordinal()];
        if (i == 1 || i == 2) {
            js7Var = new js7(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
        } else {
            if (i != 3) {
                u.b();
                return null;
            }
            js7Var = z ? new js7(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor())) : new js7(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
        }
        HomeUiState.Content.ContentHeader.ColoredText coloredText = (HomeUiState.Content.ContentHeader.ColoredText) js7Var.t;
        HomeUiState.Content.ContentHeader.ColoredText coloredText2 = (HomeUiState.Content.ContentHeader.ColoredText) js7Var.u;
        int i2 = iArr[configModules.getHome().getHeader().getBackground().getType().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                u.b();
                return null;
            }
            if (z) {
                closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
            } else {
                closeButtonColor2 = new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", configModules.getCustomization().getHeader().getForegroundColor(), coloredText.getTextColorDark(), 0.5f);
            }
            header = configModules.getHome().getHeader();
            if (z2a.w(header.getContent().getLogoUrl()) || !((logoDarkUrl = header.getContent().getLogoDarkUrl()) == null || z2a.w(logoDarkUrl))) {
                z2 = true;
            } else {
                z2 = false;
            }
            String logoUrl = header.getContent().getLogoUrl();
            String logoDarkUrl2 = header.getContent().getLogoDarkUrl();
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM326getHeaderBackdropStylebw27NRU = m326getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM326getHeaderBackdropStylebw27NRU2 = m326getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
            boolean showAvatars = header.getContent().getShowAvatars();
            List<Participant> listO = th1.O(3, teamPresence.getBuiltActiveAdmins());
            arrayList = new ArrayList(ph1.n(listO, 10));
            for (Participant participant : listO) {
                Avatar avatar = participant.getAvatar();
                avatar.getClass();
                Boolean boolIsBot = participant.isBot();
                boolIsBot.getClass();
                arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
            }
            return new HomeUiState.Content.ContentHeader(z2, logoUrl, logoDarkUrl2, coloredText2, coloredText, headerBackdropStyleM326getHeaderBackdropStylebw27NRU, headerBackdropStyleM326getHeaderBackdropStylebw27NRU2, showAvatars, arrayList, closeButtonColor2);
        }
        closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
        closeButtonColor2 = closeButtonColor;
        header = configModules.getHome().getHeader();
        if (z2a.w(header.getContent().getLogoUrl())) {
            z2 = true;
        } else {
            z2 = true;
        }
        String logoUrl2 = header.getContent().getLogoUrl();
        String logoDarkUrl3 = header.getContent().getLogoDarkUrl();
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM326getHeaderBackdropStylebw27NRU3 = m326getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM326getHeaderBackdropStylebw27NRU4 = m326getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
        boolean showAvatars2 = header.getContent().getShowAvatars();
        List<Participant> listO2 = th1.O(3, teamPresence.getBuiltActiveAdmins());
        arrayList = new ArrayList(ph1.n(listO2, 10));
        while (r0.hasNext()) {
            Avatar avatar2 = participant.getAvatar();
            avatar2.getClass();
            Boolean boolIsBot2 = participant.isBot();
            boolIsBot2.getClass();
            arrayList.add(new AvatarWrapper(avatar2, boolIsBot2.booleanValue()));
        }
        return new HomeUiState.Content.ContentHeader(z2, logoUrl2, logoDarkUrl3, coloredText2, coloredText, headerBackdropStyleM326getHeaderBackdropStylebw27NRU3, headerBackdropStyleM326getHeaderBackdropStylebw27NRU4, showAvatars2, arrayList, closeButtonColor2);
    }

    public static final HomeUiState.Error.ErrorHeader computeErrorHeader(ConfigModules configModules) {
        if (configModules == null) {
            return new HomeUiState.Error.ErrorHeader("#000000", "#FFFFFF");
        }
        return new HomeUiState.Error.ErrorHeader(configModules.getCustomization().getHeader().getBackgroundColor(), configModules.getCustomization().getHeader().getForegroundColor());
    }

    /* JADX INFO: renamed from: getHeaderBackdropStyle-bw27NRU, reason: not valid java name */
    public static final HomeUiState.Content.ContentHeader.HeaderBackdropStyle m326getHeaderBackdropStylebw27NRU(HeaderBackgroundModel headerBackgroundModel, long j, boolean z) {
        HeaderBackdropType type;
        List listI;
        ArrayList arrayList;
        String imageUrl;
        Boolean fadeToDark;
        headerBackgroundModel.getClass();
        if (!z || (type = headerBackgroundModel.getTypeDark()) == null) {
            type = headerBackgroundModel.getType();
        }
        boolean fade = (!z || (fadeToDark = headerBackgroundModel.getFadeToDark()) == null) ? headerBackgroundModel.getFade() : fadeToDark.booleanValue();
        boolean z2 = fade;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[type.ordinal()];
        qq2 qq2Var = null;
        if (i == 1) {
            if (z) {
                String colorDark = headerBackgroundModel.getColorDark();
                if (colorDark != null) {
                    j = u7d.c(ColorUtils.parseColor(colorDark));
                } else {
                    int i2 = iArr[headerBackgroundModel.getType().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        j = u7d.c(ColorUtils.parseColor(headerBackgroundModel.getColor()));
                    } else if (i2 != 3) {
                        u.b();
                        return null;
                    }
                }
            } else {
                j = u7d.c(ColorUtils.parseColor(headerBackgroundModel.getColor()));
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(j, z2, qq2Var);
        }
        if (i != 2) {
            if (i != 3) {
                u.b();
                return null;
            }
            if (!z || (imageUrl = headerBackgroundModel.getImageDarkUrl()) == null) {
                imageUrl = headerBackgroundModel.getImageUrl();
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image(j, imageUrl, z2, null);
        }
        if (z) {
            List<String> gradientDark = headerBackgroundModel.getGradientDark();
            if (gradientDark != null) {
                listI = new ArrayList(ph1.n(gradientDark, 10));
                Iterator<T> it = gradientDark.iterator();
                while (it.hasNext()) {
                    listI.add(new uh1(u7d.c(ColorUtils.parseColor((String) it.next()))));
                }
            } else {
                List<String> gradient = headerBackgroundModel.getGradient();
                if (gradient != null) {
                    arrayList = new ArrayList(ph1.n(gradient, 10));
                    Iterator<T> it2 = gradient.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new uh1(u7d.c(ColorUtils.parseColor((String) it2.next()))));
                    }
                    listI = arrayList;
                } else {
                    listI = ws0.i(new uh1(j), new uh1(j));
                }
            }
        } else {
            List<String> gradient2 = headerBackgroundModel.getGradient();
            if (gradient2 != null) {
                arrayList = new ArrayList(ph1.n(gradient2, 10));
                Iterator<T> it3 = gradient2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new uh1(u7d.c(ColorUtils.parseColor((String) it3.next()))));
                }
                listI = arrayList;
            } else {
                listI = ws0.i(new uh1(j), new uh1(j));
            }
        }
        return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(listI, z2);
    }
}
