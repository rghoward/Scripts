package io.intercom.android.sdk.m5.conversation.states;

import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaUploadItem {
    public static final int $stable = 0;
    private final String instanceId;
    private final MediaData.Media mediaData;
    private final UploadState uploadState;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface UploadState {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Error implements UploadState {
            public static final int $stable = 0;
            private final MediaUploadRepository.UploadError error;

            public Error(MediaUploadRepository.UploadError uploadError) {
                uploadError.getClass();
                this.error = uploadError;
            }

            public static /* synthetic */ Error copy$default(Error error, MediaUploadRepository.UploadError uploadError, int i, Object obj) {
                if ((i & 1) != 0) {
                    uploadError = error.error;
                }
                return error.copy(uploadError);
            }

            public final MediaUploadRepository.UploadError component1() {
                return this.error;
            }

            public final Error copy(MediaUploadRepository.UploadError uploadError) {
                uploadError.getClass();
                return new Error(uploadError);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && xj5.a(this.error, ((Error) obj).error);
            }

            public final MediaUploadRepository.UploadError getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Success implements UploadState {
            public static final int $stable = 8;
            private final Block.Builder block;

            public Success(Block.Builder builder) {
                builder.getClass();
                this.block = builder;
            }

            public static /* synthetic */ Success copy$default(Success success, Block.Builder builder, int i, Object obj) {
                if ((i & 1) != 0) {
                    builder = success.block;
                }
                return success.copy(builder);
            }

            public final Block.Builder component1() {
                return this.block;
            }

            public final Success copy(Block.Builder builder) {
                builder.getClass();
                return new Success(builder);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && xj5.a(this.block, ((Success) obj).block);
            }

            public final Block.Builder getBlock() {
                return this.block;
            }

            public int hashCode() {
                return this.block.hashCode();
            }

            public String toString() {
                return "Success(block=" + this.block + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Uploading implements UploadState {
            public static final int $stable = 0;
            public static final Uploading INSTANCE = new Uploading();

            private Uploading() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Uploading);
            }

            public int hashCode() {
                return -1726141158;
            }

            public String toString() {
                return "Uploading";
            }
        }
    }

    public MediaUploadItem(String str, MediaData.Media media, UploadState uploadState) {
        str.getClass();
        media.getClass();
        uploadState.getClass();
        this.instanceId = str;
        this.mediaData = media;
        this.uploadState = uploadState;
    }

    public static /* synthetic */ MediaUploadItem copy$default(MediaUploadItem mediaUploadItem, String str, MediaData.Media media, UploadState uploadState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaUploadItem.instanceId;
        }
        if ((i & 2) != 0) {
            media = mediaUploadItem.mediaData;
        }
        if ((i & 4) != 0) {
            uploadState = mediaUploadItem.uploadState;
        }
        return mediaUploadItem.copy(str, media, uploadState);
    }

    public final String component1() {
        return this.instanceId;
    }

    public final MediaData.Media component2() {
        return this.mediaData;
    }

    public final UploadState component3() {
        return this.uploadState;
    }

    public final MediaUploadItem copy(String str, MediaData.Media media, UploadState uploadState) {
        str.getClass();
        media.getClass();
        uploadState.getClass();
        return new MediaUploadItem(str, media, uploadState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaUploadItem)) {
            return false;
        }
        MediaUploadItem mediaUploadItem = (MediaUploadItem) obj;
        return xj5.a(this.instanceId, mediaUploadItem.instanceId) && xj5.a(this.mediaData, mediaUploadItem.mediaData) && xj5.a(this.uploadState, mediaUploadItem.uploadState);
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final MediaData.Media getMediaData() {
        return this.mediaData;
    }

    public final MediaUploadRepository.UploadError getUploadError() {
        UploadState uploadState = this.uploadState;
        UploadState.Error error = uploadState instanceof UploadState.Error ? (UploadState.Error) uploadState : null;
        if (error != null) {
            return error.getError();
        }
        return null;
    }

    public final UploadState getUploadState() {
        return this.uploadState;
    }

    public final Block.Builder getUploadedBlock() {
        UploadState uploadState = this.uploadState;
        UploadState.Success success = uploadState instanceof UploadState.Success ? (UploadState.Success) uploadState : null;
        if (success != null) {
            return success.getBlock();
        }
        return null;
    }

    public int hashCode() {
        return this.uploadState.hashCode() + ((this.mediaData.hashCode() + (this.instanceId.hashCode() * 31)) * 31);
    }

    public final boolean isError() {
        return this.uploadState instanceof UploadState.Error;
    }

    public final boolean isSuccess() {
        return this.uploadState instanceof UploadState.Success;
    }

    public final boolean isUploading() {
        return this.uploadState instanceof UploadState.Uploading;
    }

    public String toString() {
        return "MediaUploadItem(instanceId=" + this.instanceId + ", mediaData=" + this.mediaData + ", uploadState=" + this.uploadState + ')';
    }

    public /* synthetic */ MediaUploadItem(String str, MediaData.Media media, UploadState uploadState, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, media, uploadState);
    }
}
