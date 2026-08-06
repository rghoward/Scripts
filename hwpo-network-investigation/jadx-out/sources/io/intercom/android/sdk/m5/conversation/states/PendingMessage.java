package io.intercom.android.sdk.m5.conversation.states;

import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PendingMessage {
    public static final int $stable = 8;
    private final FailedMediaUploadData failedMediaUploadData;
    private final boolean isFailed;
    private final Part part;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class FailedMediaUploadData {
        public static final int $stable = 8;
        private final String clientAssignedUUID;
        private final MediaData.Media mediaData;

        public FailedMediaUploadData(String str, MediaData.Media media) {
            str.getClass();
            media.getClass();
            this.clientAssignedUUID = str;
            this.mediaData = media;
        }

        public static /* synthetic */ FailedMediaUploadData copy$default(FailedMediaUploadData failedMediaUploadData, String str, MediaData.Media media, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedMediaUploadData.clientAssignedUUID;
            }
            if ((i & 2) != 0) {
                media = failedMediaUploadData.mediaData;
            }
            return failedMediaUploadData.copy(str, media);
        }

        public final String component1() {
            return this.clientAssignedUUID;
        }

        public final MediaData.Media component2() {
            return this.mediaData;
        }

        public final FailedMediaUploadData copy(String str, MediaData.Media media) {
            str.getClass();
            media.getClass();
            return new FailedMediaUploadData(str, media);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedMediaUploadData)) {
                return false;
            }
            FailedMediaUploadData failedMediaUploadData = (FailedMediaUploadData) obj;
            return xj5.a(this.clientAssignedUUID, failedMediaUploadData.clientAssignedUUID) && xj5.a(this.mediaData, failedMediaUploadData.mediaData);
        }

        public final String getClientAssignedUUID() {
            return this.clientAssignedUUID;
        }

        public final MediaData.Media getMediaData() {
            return this.mediaData;
        }

        public int hashCode() {
            return this.mediaData.hashCode() + (this.clientAssignedUUID.hashCode() * 31);
        }

        public String toString() {
            return "FailedMediaUploadData(clientAssignedUUID=" + this.clientAssignedUUID + ", mediaData=" + this.mediaData + ')';
        }
    }

    public PendingMessage(Part part, boolean z, FailedMediaUploadData failedMediaUploadData) {
        part.getClass();
        this.part = part;
        this.isFailed = z;
        this.failedMediaUploadData = failedMediaUploadData;
    }

    public static /* synthetic */ PendingMessage copy$default(PendingMessage pendingMessage, Part part, boolean z, FailedMediaUploadData failedMediaUploadData, int i, Object obj) {
        if ((i & 1) != 0) {
            part = pendingMessage.part;
        }
        if ((i & 2) != 0) {
            z = pendingMessage.isFailed;
        }
        if ((i & 4) != 0) {
            failedMediaUploadData = pendingMessage.failedMediaUploadData;
        }
        return pendingMessage.copy(part, z, failedMediaUploadData);
    }

    public final Part component1() {
        return this.part;
    }

    public final boolean component2() {
        return this.isFailed;
    }

    public final FailedMediaUploadData component3() {
        return this.failedMediaUploadData;
    }

    public final PendingMessage copy(Part part, boolean z, FailedMediaUploadData failedMediaUploadData) {
        part.getClass();
        return new PendingMessage(part, z, failedMediaUploadData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingMessage)) {
            return false;
        }
        PendingMessage pendingMessage = (PendingMessage) obj;
        return xj5.a(this.part, pendingMessage.part) && this.isFailed == pendingMessage.isFailed && xj5.a(this.failedMediaUploadData, pendingMessage.failedMediaUploadData);
    }

    public final FailedMediaUploadData getFailedMediaUploadData() {
        return this.failedMediaUploadData;
    }

    public final Part getPart() {
        return this.part;
    }

    public int hashCode() {
        int iA = uo2.a(this.part.hashCode() * 31, this.isFailed, 31);
        FailedMediaUploadData failedMediaUploadData = this.failedMediaUploadData;
        return iA + (failedMediaUploadData == null ? 0 : failedMediaUploadData.hashCode());
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public String toString() {
        return "PendingMessage(part=" + this.part + ", isFailed=" + this.isFailed + ", failedMediaUploadData=" + this.failedMediaUploadData + ')';
    }

    public /* synthetic */ PendingMessage(Part part, boolean z, FailedMediaUploadData failedMediaUploadData, int i, qq2 qq2Var) {
        this(part, z, (i & 4) != 0 ? null : failedMediaUploadData);
    }
}
