package io.intercom.android.sdk.lightcompressor.config;

import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Configuration {
    private boolean disableAudio;
    private boolean isMinBitrateCheckEnabled;
    private final boolean keepOriginalResolution;
    private VideoQuality quality;
    private Integer videoBitrateInMbps;
    private Double videoHeight;
    private List<String> videoNames;
    private Double videoWidth;

    public /* synthetic */ Configuration(VideoQuality videoQuality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List list, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? VideoQuality.MEDIUM : videoQuality, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Configuration copy$default(Configuration configuration, VideoQuality videoQuality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            videoQuality = configuration.quality;
        }
        if ((i & 2) != 0) {
            z = configuration.isMinBitrateCheckEnabled;
        }
        if ((i & 4) != 0) {
            num = configuration.videoBitrateInMbps;
        }
        if ((i & 8) != 0) {
            z2 = configuration.disableAudio;
        }
        if ((i & 16) != 0) {
            z3 = configuration.keepOriginalResolution;
        }
        if ((i & 32) != 0) {
            d = configuration.videoHeight;
        }
        if ((i & 64) != 0) {
            d2 = configuration.videoWidth;
        }
        if ((i & 128) != 0) {
            list = configuration.videoNames;
        }
        Double d3 = d2;
        List list2 = list;
        boolean z4 = z3;
        Double d4 = d;
        return configuration.copy(videoQuality, z, num, z2, z4, d4, d3, list2);
    }

    public final VideoQuality component1() {
        return this.quality;
    }

    public final boolean component2() {
        return this.isMinBitrateCheckEnabled;
    }

    public final Integer component3() {
        return this.videoBitrateInMbps;
    }

    public final boolean component4() {
        return this.disableAudio;
    }

    public final boolean component5() {
        return this.keepOriginalResolution;
    }

    public final Double component6() {
        return this.videoHeight;
    }

    public final Double component7() {
        return this.videoWidth;
    }

    public final List<String> component8() {
        return this.videoNames;
    }

    public final Configuration copy(VideoQuality videoQuality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List<String> list) {
        videoQuality.getClass();
        list.getClass();
        return new Configuration(videoQuality, z, num, z2, z3, d, d2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.quality == configuration.quality && this.isMinBitrateCheckEnabled == configuration.isMinBitrateCheckEnabled && xj5.a(this.videoBitrateInMbps, configuration.videoBitrateInMbps) && this.disableAudio == configuration.disableAudio && this.keepOriginalResolution == configuration.keepOriginalResolution && xj5.a(this.videoHeight, configuration.videoHeight) && xj5.a(this.videoWidth, configuration.videoWidth) && xj5.a(this.videoNames, configuration.videoNames);
    }

    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    public final VideoQuality getQuality() {
        return this.quality;
    }

    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    public final List<String> getVideoNames() {
        return this.videoNames;
    }

    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        int iA = uo2.a(this.quality.hashCode() * 31, this.isMinBitrateCheckEnabled, 31);
        Integer num = this.videoBitrateInMbps;
        int iA2 = uo2.a(uo2.a((iA + (num == null ? 0 : num.hashCode())) * 31, this.disableAudio, 31), this.keepOriginalResolution, 31);
        Double d = this.videoHeight;
        int iHashCode = (iA2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.videoWidth;
        return this.videoNames.hashCode() + ((iHashCode + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final boolean isMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    public final void setDisableAudio(boolean z) {
        this.disableAudio = z;
    }

    public final void setMinBitrateCheckEnabled(boolean z) {
        this.isMinBitrateCheckEnabled = z;
    }

    public final void setQuality(VideoQuality videoQuality) {
        videoQuality.getClass();
        this.quality = videoQuality;
    }

    public final void setVideoBitrateInMbps(Integer num) {
        this.videoBitrateInMbps = num;
    }

    public final void setVideoHeight(Double d) {
        this.videoHeight = d;
    }

    public final void setVideoNames(List<String> list) {
        list.getClass();
        this.videoNames = list;
    }

    public final void setVideoWidth(Double d) {
        this.videoWidth = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(quality=");
        sb.append(this.quality);
        sb.append(", isMinBitrateCheckEnabled=");
        sb.append(this.isMinBitrateCheckEnabled);
        sb.append(", videoBitrateInMbps=");
        sb.append(this.videoBitrateInMbps);
        sb.append(", disableAudio=");
        sb.append(this.disableAudio);
        sb.append(", keepOriginalResolution=");
        sb.append(this.keepOriginalResolution);
        sb.append(", videoHeight=");
        sb.append(this.videoHeight);
        sb.append(", videoWidth=");
        sb.append(this.videoWidth);
        sb.append(", videoNames=");
        return zc6.a(sb, this.videoNames, ')');
    }

    public Configuration(VideoQuality videoQuality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List<String> list) {
        videoQuality.getClass();
        list.getClass();
        this.quality = videoQuality;
        this.isMinBitrateCheckEnabled = z;
        this.videoBitrateInMbps = num;
        this.disableAudio = z2;
        this.keepOriginalResolution = z3;
        this.videoHeight = d;
        this.videoWidth = d2;
        this.videoNames = list;
    }
}
