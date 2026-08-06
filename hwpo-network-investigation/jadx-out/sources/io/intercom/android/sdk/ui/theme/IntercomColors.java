package io.intercom.android.sdk.ui.theme;

import defpackage.a83;
import defpackage.al;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomColors {
    public static final int $stable = 0;
    private final long action;
    private final long actionContrastWhite;
    private final long active;
    private final long adminBackground;
    private final long adminBorder;
    private final IntercomAlphaColors alpha;
    private final long badge;
    private final IntercomBaseColors base;
    private final IntercomBorderColors border;
    private final long bubbleBackground;
    private final long collectorBorder;
    private final long collectorSelected;
    private final long composerMediaBackground;
    private final long composerMediaPlayBackground;
    private final long composerMediaUploadingBackground;
    private final long composerMediaUploadingForeground;
    private final IntercomContainerColors container;
    private final long disabled;
    private final long divider;
    private final long error;
    private final long header;
    private final IntercomIconColors icon;
    private final long inputAlt;
    private final boolean isLight;
    private final long isTyping;
    private final long onAction;
    private final long onActionContrastWhite;
    private final long onHeader;
    private final long poweredByBackgroundColor;
    private final long shadow;
    private final long sourceBackground;
    private final long specialNoticeBorder;
    private final long submitted;
    private final IntercomTextColors text;
    private final long timestampBackground;

    private IntercomColors(long j, long j2, long j3, long j4, long j5, long j6, IntercomBaseColors intercomBaseColors, IntercomTextColors intercomTextColors, IntercomIconColors intercomIconColors, IntercomContainerColors intercomContainerColors, IntercomBorderColors intercomBorderColors, IntercomAlphaColors intercomAlphaColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, boolean z) {
        intercomBaseColors.getClass();
        intercomTextColors.getClass();
        intercomIconColors.getClass();
        intercomContainerColors.getClass();
        intercomBorderColors.getClass();
        intercomAlphaColors.getClass();
        this.action = j;
        this.onAction = j2;
        this.actionContrastWhite = j3;
        this.onActionContrastWhite = j4;
        this.header = j5;
        this.onHeader = j6;
        this.base = intercomBaseColors;
        this.text = intercomTextColors;
        this.icon = intercomIconColors;
        this.container = intercomContainerColors;
        this.border = intercomBorderColors;
        this.alpha = intercomAlphaColors;
        this.bubbleBackground = j7;
        this.adminBackground = j8;
        this.timestampBackground = j9;
        this.sourceBackground = j10;
        this.inputAlt = j11;
        this.poweredByBackgroundColor = j12;
        this.disabled = j13;
        this.composerMediaBackground = j14;
        this.composerMediaUploadingBackground = j15;
        this.composerMediaUploadingForeground = j16;
        this.composerMediaPlayBackground = j17;
        this.isTyping = j18;
        this.adminBorder = j19;
        this.collectorBorder = j20;
        this.specialNoticeBorder = j21;
        this.divider = j22;
        this.collectorSelected = j23;
        this.badge = j24;
        this.submitted = j25;
        this.active = j26;
        this.error = j27;
        this.shadow = j28;
        this.isLight = z;
    }

    /* JADX INFO: renamed from: copy-TALst2k$default, reason: not valid java name */
    public static /* synthetic */ IntercomColors m721copyTALst2k$default(IntercomColors intercomColors, long j, long j2, long j3, long j4, long j5, long j6, IntercomBaseColors intercomBaseColors, IntercomTextColors intercomTextColors, IntercomIconColors intercomIconColors, IntercomContainerColors intercomContainerColors, IntercomBorderColors intercomBorderColors, IntercomAlphaColors intercomAlphaColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, boolean z, int i, int i2, Object obj) {
        long j29 = (i & 1) != 0 ? intercomColors.action : j;
        return intercomColors.m750copyTALst2k(j29, (i & 2) != 0 ? intercomColors.onAction : j2, (i & 4) != 0 ? intercomColors.actionContrastWhite : j3, (i & 8) != 0 ? intercomColors.onActionContrastWhite : j4, (i & 16) != 0 ? intercomColors.header : j5, (i & 32) != 0 ? intercomColors.onHeader : j6, (i & 64) != 0 ? intercomColors.base : intercomBaseColors, (i & 128) != 0 ? intercomColors.text : intercomTextColors, (i & 256) != 0 ? intercomColors.icon : intercomIconColors, (i & 512) != 0 ? intercomColors.container : intercomContainerColors, (i & 1024) != 0 ? intercomColors.border : intercomBorderColors, (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? intercomColors.alpha : intercomAlphaColors, (i & 4096) != 0 ? intercomColors.bubbleBackground : j7, (i & 8192) != 0 ? intercomColors.adminBackground : j8, (i & 16384) != 0 ? intercomColors.timestampBackground : j9, (i & 32768) != 0 ? intercomColors.sourceBackground : j10, (i & 65536) != 0 ? intercomColors.inputAlt : j11, (i & 131072) != 0 ? intercomColors.poweredByBackgroundColor : j12, (i & 262144) != 0 ? intercomColors.disabled : j13, (i & 524288) != 0 ? intercomColors.composerMediaBackground : j14, (i & 1048576) != 0 ? intercomColors.composerMediaUploadingBackground : j15, (i & 2097152) != 0 ? intercomColors.composerMediaUploadingForeground : j16, (i & 4194304) != 0 ? intercomColors.composerMediaPlayBackground : j17, (i & 8388608) != 0 ? intercomColors.isTyping : j18, (i & 16777216) != 0 ? intercomColors.adminBorder : j19, (i & 33554432) != 0 ? intercomColors.collectorBorder : j20, (i & 67108864) != 0 ? intercomColors.specialNoticeBorder : j21, (i & 134217728) != 0 ? intercomColors.divider : j22, (i & 268435456) != 0 ? intercomColors.collectorSelected : j23, (i & 536870912) != 0 ? intercomColors.badge : j24, (i & 1073741824) != 0 ? intercomColors.submitted : j25, (i & Integer.MIN_VALUE) != 0 ? intercomColors.active : j26, (i2 & 1) != 0 ? intercomColors.error : j27, (i2 & 2) != 0 ? intercomColors.shadow : j28, (i2 & 4) != 0 ? intercomColors.isLight : z);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m722component10d7_KjU() {
        return this.action;
    }

    public final IntercomContainerColors component10() {
        return this.container;
    }

    public final IntercomBorderColors component11() {
        return this.border;
    }

    public final IntercomAlphaColors component12() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component13-0d7_KjU, reason: not valid java name */
    public final long m723component130d7_KjU() {
        return this.bubbleBackground;
    }

    /* JADX INFO: renamed from: component14-0d7_KjU, reason: not valid java name */
    public final long m724component140d7_KjU() {
        return this.adminBackground;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m725component150d7_KjU() {
        return this.timestampBackground;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m726component160d7_KjU() {
        return this.sourceBackground;
    }

    /* JADX INFO: renamed from: component17-0d7_KjU, reason: not valid java name */
    public final long m727component170d7_KjU() {
        return this.inputAlt;
    }

    /* JADX INFO: renamed from: component18-0d7_KjU, reason: not valid java name */
    public final long m728component180d7_KjU() {
        return this.poweredByBackgroundColor;
    }

    /* JADX INFO: renamed from: component19-0d7_KjU, reason: not valid java name */
    public final long m729component190d7_KjU() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m730component20d7_KjU() {
        return this.onAction;
    }

    /* JADX INFO: renamed from: component20-0d7_KjU, reason: not valid java name */
    public final long m731component200d7_KjU() {
        return this.composerMediaBackground;
    }

    /* JADX INFO: renamed from: component21-0d7_KjU, reason: not valid java name */
    public final long m732component210d7_KjU() {
        return this.composerMediaUploadingBackground;
    }

    /* JADX INFO: renamed from: component22-0d7_KjU, reason: not valid java name */
    public final long m733component220d7_KjU() {
        return this.composerMediaUploadingForeground;
    }

    /* JADX INFO: renamed from: component23-0d7_KjU, reason: not valid java name */
    public final long m734component230d7_KjU() {
        return this.composerMediaPlayBackground;
    }

    /* JADX INFO: renamed from: component24-0d7_KjU, reason: not valid java name */
    public final long m735component240d7_KjU() {
        return this.isTyping;
    }

    /* JADX INFO: renamed from: component25-0d7_KjU, reason: not valid java name */
    public final long m736component250d7_KjU() {
        return this.adminBorder;
    }

    /* JADX INFO: renamed from: component26-0d7_KjU, reason: not valid java name */
    public final long m737component260d7_KjU() {
        return this.collectorBorder;
    }

    /* JADX INFO: renamed from: component27-0d7_KjU, reason: not valid java name */
    public final long m738component270d7_KjU() {
        return this.specialNoticeBorder;
    }

    /* JADX INFO: renamed from: component28-0d7_KjU, reason: not valid java name */
    public final long m739component280d7_KjU() {
        return this.divider;
    }

    /* JADX INFO: renamed from: component29-0d7_KjU, reason: not valid java name */
    public final long m740component290d7_KjU() {
        return this.collectorSelected;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m741component30d7_KjU() {
        return this.actionContrastWhite;
    }

    /* JADX INFO: renamed from: component30-0d7_KjU, reason: not valid java name */
    public final long m742component300d7_KjU() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component31-0d7_KjU, reason: not valid java name */
    public final long m743component310d7_KjU() {
        return this.submitted;
    }

    /* JADX INFO: renamed from: component32-0d7_KjU, reason: not valid java name */
    public final long m744component320d7_KjU() {
        return this.active;
    }

    /* JADX INFO: renamed from: component33-0d7_KjU, reason: not valid java name */
    public final long m745component330d7_KjU() {
        return this.error;
    }

    /* JADX INFO: renamed from: component34-0d7_KjU, reason: not valid java name */
    public final long m746component340d7_KjU() {
        return this.shadow;
    }

    public final boolean component35() {
        return this.isLight;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m747component40d7_KjU() {
        return this.onActionContrastWhite;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m748component50d7_KjU() {
        return this.header;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m749component60d7_KjU() {
        return this.onHeader;
    }

    public final IntercomBaseColors component7() {
        return this.base;
    }

    public final IntercomTextColors component8() {
        return this.text;
    }

    public final IntercomIconColors component9() {
        return this.icon;
    }

    /* JADX INFO: renamed from: copy-TALst2k, reason: not valid java name */
    public final IntercomColors m750copyTALst2k(long j, long j2, long j3, long j4, long j5, long j6, IntercomBaseColors intercomBaseColors, IntercomTextColors intercomTextColors, IntercomIconColors intercomIconColors, IntercomContainerColors intercomContainerColors, IntercomBorderColors intercomBorderColors, IntercomAlphaColors intercomAlphaColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, boolean z) {
        intercomBaseColors.getClass();
        intercomTextColors.getClass();
        intercomIconColors.getClass();
        intercomContainerColors.getClass();
        intercomBorderColors.getClass();
        intercomAlphaColors.getClass();
        return new IntercomColors(j, j2, j3, j4, j5, j6, intercomBaseColors, intercomTextColors, intercomIconColors, intercomContainerColors, intercomBorderColors, intercomAlphaColors, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomColors)) {
            return false;
        }
        IntercomColors intercomColors = (IntercomColors) obj;
        return uh1.c(this.action, intercomColors.action) && uh1.c(this.onAction, intercomColors.onAction) && uh1.c(this.actionContrastWhite, intercomColors.actionContrastWhite) && uh1.c(this.onActionContrastWhite, intercomColors.onActionContrastWhite) && uh1.c(this.header, intercomColors.header) && uh1.c(this.onHeader, intercomColors.onHeader) && xj5.a(this.base, intercomColors.base) && xj5.a(this.text, intercomColors.text) && xj5.a(this.icon, intercomColors.icon) && xj5.a(this.container, intercomColors.container) && xj5.a(this.border, intercomColors.border) && xj5.a(this.alpha, intercomColors.alpha) && uh1.c(this.bubbleBackground, intercomColors.bubbleBackground) && uh1.c(this.adminBackground, intercomColors.adminBackground) && uh1.c(this.timestampBackground, intercomColors.timestampBackground) && uh1.c(this.sourceBackground, intercomColors.sourceBackground) && uh1.c(this.inputAlt, intercomColors.inputAlt) && uh1.c(this.poweredByBackgroundColor, intercomColors.poweredByBackgroundColor) && uh1.c(this.disabled, intercomColors.disabled) && uh1.c(this.composerMediaBackground, intercomColors.composerMediaBackground) && uh1.c(this.composerMediaUploadingBackground, intercomColors.composerMediaUploadingBackground) && uh1.c(this.composerMediaUploadingForeground, intercomColors.composerMediaUploadingForeground) && uh1.c(this.composerMediaPlayBackground, intercomColors.composerMediaPlayBackground) && uh1.c(this.isTyping, intercomColors.isTyping) && uh1.c(this.adminBorder, intercomColors.adminBorder) && uh1.c(this.collectorBorder, intercomColors.collectorBorder) && uh1.c(this.specialNoticeBorder, intercomColors.specialNoticeBorder) && uh1.c(this.divider, intercomColors.divider) && uh1.c(this.collectorSelected, intercomColors.collectorSelected) && uh1.c(this.badge, intercomColors.badge) && uh1.c(this.submitted, intercomColors.submitted) && uh1.c(this.active, intercomColors.active) && uh1.c(this.error, intercomColors.error) && uh1.c(this.shadow, intercomColors.shadow) && this.isLight == intercomColors.isLight;
    }

    /* JADX INFO: renamed from: getAction-0d7_KjU, reason: not valid java name */
    public final long m751getAction0d7_KjU() {
        return this.action;
    }

    /* JADX INFO: renamed from: getActionContrastWhite-0d7_KjU, reason: not valid java name */
    public final long m752getActionContrastWhite0d7_KjU() {
        return this.actionContrastWhite;
    }

    /* JADX INFO: renamed from: getActive-0d7_KjU, reason: not valid java name */
    public final long m753getActive0d7_KjU() {
        return this.active;
    }

    /* JADX INFO: renamed from: getAdminBackground-0d7_KjU, reason: not valid java name */
    public final long m754getAdminBackground0d7_KjU() {
        return this.adminBackground;
    }

    /* JADX INFO: renamed from: getAdminBorder-0d7_KjU, reason: not valid java name */
    public final long m755getAdminBorder0d7_KjU() {
        return this.adminBorder;
    }

    public final IntercomAlphaColors getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: getBadge-0d7_KjU, reason: not valid java name */
    public final long m756getBadge0d7_KjU() {
        return this.badge;
    }

    public final IntercomBaseColors getBase() {
        return this.base;
    }

    public final IntercomBorderColors getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: getBubbleBackground-0d7_KjU, reason: not valid java name */
    public final long m757getBubbleBackground0d7_KjU() {
        return this.bubbleBackground;
    }

    /* JADX INFO: renamed from: getCollectorBorder-0d7_KjU, reason: not valid java name */
    public final long m758getCollectorBorder0d7_KjU() {
        return this.collectorBorder;
    }

    /* JADX INFO: renamed from: getCollectorSelected-0d7_KjU, reason: not valid java name */
    public final long m759getCollectorSelected0d7_KjU() {
        return this.collectorSelected;
    }

    /* JADX INFO: renamed from: getComposerMediaBackground-0d7_KjU, reason: not valid java name */
    public final long m760getComposerMediaBackground0d7_KjU() {
        return this.composerMediaBackground;
    }

    /* JADX INFO: renamed from: getComposerMediaPlayBackground-0d7_KjU, reason: not valid java name */
    public final long m761getComposerMediaPlayBackground0d7_KjU() {
        return this.composerMediaPlayBackground;
    }

    /* JADX INFO: renamed from: getComposerMediaUploadingBackground-0d7_KjU, reason: not valid java name */
    public final long m762getComposerMediaUploadingBackground0d7_KjU() {
        return this.composerMediaUploadingBackground;
    }

    /* JADX INFO: renamed from: getComposerMediaUploadingForeground-0d7_KjU, reason: not valid java name */
    public final long m763getComposerMediaUploadingForeground0d7_KjU() {
        return this.composerMediaUploadingForeground;
    }

    public final IntercomContainerColors getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: getDisabled-0d7_KjU, reason: not valid java name */
    public final long m764getDisabled0d7_KjU() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: getDivider-0d7_KjU, reason: not valid java name */
    public final long m765getDivider0d7_KjU() {
        return this.divider;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m766getError0d7_KjU() {
        return this.error;
    }

    /* JADX INFO: renamed from: getHeader-0d7_KjU, reason: not valid java name */
    public final long m767getHeader0d7_KjU() {
        return this.header;
    }

    public final IntercomIconColors getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: getInputAlt-0d7_KjU, reason: not valid java name */
    public final long m768getInputAlt0d7_KjU() {
        return this.inputAlt;
    }

    /* JADX INFO: renamed from: getOnAction-0d7_KjU, reason: not valid java name */
    public final long m769getOnAction0d7_KjU() {
        return this.onAction;
    }

    /* JADX INFO: renamed from: getOnActionContrastWhite-0d7_KjU, reason: not valid java name */
    public final long m770getOnActionContrastWhite0d7_KjU() {
        return this.onActionContrastWhite;
    }

    /* JADX INFO: renamed from: getOnHeader-0d7_KjU, reason: not valid java name */
    public final long m771getOnHeader0d7_KjU() {
        return this.onHeader;
    }

    /* JADX INFO: renamed from: getPoweredByBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m772getPoweredByBackgroundColor0d7_KjU() {
        return this.poweredByBackgroundColor;
    }

    /* JADX INFO: renamed from: getShadow-0d7_KjU, reason: not valid java name */
    public final long m773getShadow0d7_KjU() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: getSourceBackground-0d7_KjU, reason: not valid java name */
    public final long m774getSourceBackground0d7_KjU() {
        return this.sourceBackground;
    }

    /* JADX INFO: renamed from: getSpecialNoticeBorder-0d7_KjU, reason: not valid java name */
    public final long m775getSpecialNoticeBorder0d7_KjU() {
        return this.specialNoticeBorder;
    }

    /* JADX INFO: renamed from: getSubmitted-0d7_KjU, reason: not valid java name */
    public final long m776getSubmitted0d7_KjU() {
        return this.submitted;
    }

    public final IntercomTextColors getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getTimestampBackground-0d7_KjU, reason: not valid java name */
    public final long m777getTimestampBackground0d7_KjU() {
        return this.timestampBackground;
    }

    public int hashCode() {
        long j = this.action;
        int i = uh1.l;
        return Boolean.hashCode(this.isLight) + al.c(this.shadow, al.c(this.error, al.c(this.active, al.c(this.submitted, al.c(this.badge, al.c(this.collectorSelected, al.c(this.divider, al.c(this.specialNoticeBorder, al.c(this.collectorBorder, al.c(this.adminBorder, al.c(this.isTyping, al.c(this.composerMediaPlayBackground, al.c(this.composerMediaUploadingForeground, al.c(this.composerMediaUploadingBackground, al.c(this.composerMediaBackground, al.c(this.disabled, al.c(this.poweredByBackgroundColor, al.c(this.inputAlt, al.c(this.sourceBackground, al.c(this.timestampBackground, al.c(this.adminBackground, al.c(this.bubbleBackground, (this.alpha.hashCode() + ((this.border.hashCode() + ((this.container.hashCode() + ((this.icon.hashCode() + ((this.text.hashCode() + ((this.base.hashCode() + al.c(this.onHeader, al.c(this.header, al.c(this.onActionContrastWhite, al.c(this.actionContrastWhite, al.c(this.onAction, Long.hashCode(j) * 31, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isLight() {
        return this.isLight;
    }

    /* JADX INFO: renamed from: isTyping-0d7_KjU, reason: not valid java name */
    public final long m778isTyping0d7_KjU() {
        return this.isTyping;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomColors(action=");
        a83.b(this.action, ", onAction=", sb);
        a83.b(this.onAction, ", actionContrastWhite=", sb);
        a83.b(this.actionContrastWhite, ", onActionContrastWhite=", sb);
        a83.b(this.onActionContrastWhite, ", header=", sb);
        a83.b(this.header, ", onHeader=", sb);
        a83.b(this.onHeader, ", base=", sb);
        sb.append(this.base);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", container=");
        sb.append(this.container);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", bubbleBackground=");
        a83.b(this.bubbleBackground, ", adminBackground=", sb);
        a83.b(this.adminBackground, ", timestampBackground=", sb);
        a83.b(this.timestampBackground, ", sourceBackground=", sb);
        a83.b(this.sourceBackground, ", inputAlt=", sb);
        a83.b(this.inputAlt, ", poweredByBackgroundColor=", sb);
        a83.b(this.poweredByBackgroundColor, ", disabled=", sb);
        a83.b(this.disabled, ", composerMediaBackground=", sb);
        a83.b(this.composerMediaBackground, ", composerMediaUploadingBackground=", sb);
        a83.b(this.composerMediaUploadingBackground, ", composerMediaUploadingForeground=", sb);
        a83.b(this.composerMediaUploadingForeground, ", composerMediaPlayBackground=", sb);
        a83.b(this.composerMediaPlayBackground, ", isTyping=", sb);
        a83.b(this.isTyping, ", adminBorder=", sb);
        a83.b(this.adminBorder, ", collectorBorder=", sb);
        a83.b(this.collectorBorder, ", specialNoticeBorder=", sb);
        a83.b(this.specialNoticeBorder, ", divider=", sb);
        a83.b(this.divider, ", collectorSelected=", sb);
        a83.b(this.collectorSelected, ", badge=", sb);
        a83.b(this.badge, ", submitted=", sb);
        a83.b(this.submitted, ", active=", sb);
        a83.b(this.active, ", error=", sb);
        a83.b(this.error, ", shadow=", sb);
        a83.b(this.shadow, ", isLight=", sb);
        return pi1.a(sb, this.isLight, ')');
    }

    public /* synthetic */ IntercomColors(long j, long j2, long j3, long j4, long j5, long j6, IntercomBaseColors intercomBaseColors, IntercomTextColors intercomTextColors, IntercomIconColors intercomIconColors, IntercomContainerColors intercomContainerColors, IntercomBorderColors intercomBorderColors, IntercomAlphaColors intercomAlphaColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, boolean z, qq2 qq2Var) {
        this(j, j2, j3, j4, j5, j6, intercomBaseColors, intercomTextColors, intercomIconColors, intercomContainerColors, intercomBorderColors, intercomAlphaColors, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, z);
    }
}
