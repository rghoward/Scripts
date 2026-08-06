package io.intercom.android.sdk.m5.conversation.data;

import android.content.Context;
import android.net.Uri;
import defpackage.aa0;
import defpackage.al;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.e41;
import defpackage.e44;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.ib7;
import defpackage.kc7;
import defpackage.mh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.r02;
import defpackage.sd;
import defpackage.t72;
import defpackage.th0;
import defpackage.u;
import defpackage.u02;
import defpackage.u72;
import defpackage.uv2;
import defpackage.v72;
import defpackage.vg0;
import defpackage.ws0;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.xq6;
import defpackage.z;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.m5.utils.MediaCompressionKt;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaUploadRepository {
    public static final int $stable = 8;
    private final Context applicationContext;
    private final mh4<AttachmentSettings> attachmentSettings;
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository$uploadMediaItems$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository$uploadMediaItems$2", f = "MediaUploadRepository.kt", l = {41}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super List<? extends UploadResult>>, Object> {
        final /* synthetic */ List<MediaData.Media> $mediaItems;
        final /* synthetic */ int $transparencyBackgroundColor;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MediaUploadRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends MediaData.Media> list, MediaUploadRepository mediaUploadRepository, int i, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$mediaItems = list;
            this.this$0 = mediaUploadRepository;
            this.$transparencyBackgroundColor = i;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$mediaItems, this.this$0, this.$transparencyBackgroundColor, r02Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super List<? extends UploadResult>> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objR;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            t72 t72Var = (t72) this.L$0;
            List<MediaData.Media> list = this.$mediaItems;
            MediaUploadRepository mediaUploadRepository = this.this$0;
            int i2 = this.$transparencyBackgroundColor;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(oy0.b(t72Var, null, new MediaUploadRepository$uploadMediaItems$2$1$1(mediaUploadRepository, (MediaData.Media) it.next(), i2, null), 3));
            }
            this.label = 1;
            if (arrayList.isEmpty()) {
                objR = hf3.t;
            } else {
                uv2[] uv2VarArr = (uv2[]) arrayList.toArray(new uv2[0]);
                vg0 vg0Var = new vg0(uv2VarArr);
                e41 e41Var = new e41(1, th0.e(this));
                e41Var.t();
                int length = uv2VarArr.length;
                vg0.a[] aVarArr = new vg0.a[length];
                for (int i3 = 0; i3 < length; i3++) {
                    uv2 uv2Var = uv2VarArr[i3];
                    uv2Var.start();
                    vg0.a aVar = new vg0.a(e41Var);
                    aVar.B = sd.g(uv2Var, aVar);
                    g2b g2bVar = g2b.a;
                    aVarArr[i3] = aVar;
                }
                vg0.b bVar = new vg0.b(aVarArr);
                for (int i4 = 0; i4 < length; i4++) {
                    aVarArr[i4].t(bVar);
                }
                if (e41Var.s() instanceof kc7) {
                    e41Var.w(bVar);
                } else {
                    bVar.a();
                }
                objR = e41Var.r();
            }
            v72 v72Var = v72.t;
            return objR == v72Var ? v72Var : objR;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository$uploadSingleMediaItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository", f = "MediaUploadRepository.kt", l = {59, 75}, m = "uploadSingleMediaItem")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaUploadRepository.this.uploadSingleMediaItem(null, 0, this);
        }
    }

    public /* synthetic */ MediaUploadRepository(ConversationRepository conversationRepository, Context context, mh4 mh4Var, int i, qq2 qq2Var) {
        this(conversationRepository, (i & 2) != 0 ? Injector.get().getApplication() : context, (i & 4) != 0 ? new xq6(0) : mh4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachmentSettings _init_$lambda$0() {
        return ((AppConfig) z.a()).getAttachmentSettings();
    }

    private final Block.Builder buildBlockForMedia(MediaData.Media media, String str, long j) {
        if (media instanceof MediaData.Media.Image) {
            MediaData.Media.Image image = (MediaData.Media.Image) media;
            Block.Builder builderWithType = new Block.Builder().withUrl(str).withWidth(image.getWidth()).withHeight(image.getHeight()).withType(BlockType.IMAGE.getSerializedName());
            builderWithType.getClass();
            return builderWithType;
        }
        if (!(media instanceof MediaData.Media.Video) && !(media instanceof MediaData.Media.Other)) {
            u.b();
            return null;
        }
        Block.Builder builderWithType2 = new Block.Builder().withAttachments(ws0.h(BlockAttachment.Companion.create$default(BlockAttachment.Companion, media.getFileName(), str, media.getMimeType(), null, media.getSize(), j, 8, null))).withType(BlockType.ATTACHMENTLIST.getSerializedName());
        builderWithType2.getClass();
        return builderWithType2;
    }

    public static /* synthetic */ Object uploadMediaItems$default(MediaUploadRepository mediaUploadRepository, List list, int i, r02 r02Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return mediaUploadRepository.uploadMediaItems(list, i, r02Var);
    }

    public static /* synthetic */ Object uploadSingleMediaItem$default(MediaUploadRepository mediaUploadRepository, MediaData.Media media, int i, r02 r02Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return mediaUploadRepository.uploadSingleMediaItem(media, i, r02Var);
    }

    public final Object uploadMediaItems(List<? extends MediaData.Media> list, int i, r02<? super List<? extends UploadResult>> r02Var) {
        return u72.d(new AnonymousClass2(list, this, i, null), r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f5 A[Catch: all -> 0x003b, Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0116 A[Catch: all -> 0x003b, Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011a A[Catch: all -> 0x003b, Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012b A[Catch: all -> 0x003b, Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x012f A[Catch: all -> 0x003b, Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0140 A[Catch: all -> 0x003b, Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0144 A[Catch: all -> 0x003b, Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:62:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x015d A[Catch: all -> 0x003b, Exception -> 0x003e, TRY_ENTER, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0036, B:48:0x00ef, B:50:0x00f5, B:51:0x0116, B:53:0x011a, B:54:0x012b, B:56:0x012f, B:57:0x0140, B:59:0x0144, B:63:0x015d, B:64:0x0162, B:22:0x004b, B:33:0x0092, B:25:0x0052, B:27:0x0056, B:29:0x0063, B:30:0x0083), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object uploadSingleMediaItem(MediaData.Media media, int i, r02<? super UploadResult> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        MediaData.Media media2;
        MediaData.Media media3;
        Object failure;
        Uri uri;
        NetworkResponse networkResponse;
        MediaUploadRepository mediaUploadRepository = this;
        MediaData.Media mediaCopy$default = media;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = mediaUploadRepository.new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = mediaUploadRepository.new AnonymousClass1(r02Var);
        }
        Object compressedMediaData = anonymousClass1.result;
        int i3 = anonymousClass1.label;
        MediaData.Media media4 = null;
        v72 v72Var = v72.t;
        try {
            try {
                try {
                    if (i3 == 0) {
                        dv8.b(compressedMediaData);
                        if ((mediaCopy$default instanceof MediaData.Media.Image) && ((MediaData.Media.Image) mediaCopy$default).getExifData().isEmpty()) {
                            mediaCopy$default = MediaData.Media.Image.copy$default((MediaData.Media.Image) mediaCopy$default, null, 0, 0, 0L, null, null, BitmapUtilsKt.extractExifData(mediaUploadRepository.applicationContext, ((MediaData.Media.Image) mediaCopy$default).getUri()), 63, null);
                        }
                        Context context = mediaUploadRepository.applicationContext;
                        anonymousClass1.L$0 = mediaUploadRepository;
                        anonymousClass1.label = 1;
                        compressedMediaData = MediaCompressionKt.getCompressedMediaData(mediaCopy$default, context, i, anonymousClass1);
                        if (compressedMediaData == v72Var) {
                        }
                        return v72Var;
                    }
                    if (i3 == 1) {
                        mediaUploadRepository = (MediaUploadRepository) anonymousClass1.L$0;
                        dv8.b(compressedMediaData);
                    } else {
                        if (i3 != 2) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        media3 = (MediaData.Media) anonymousClass1.L$1;
                        mediaUploadRepository = (MediaUploadRepository) anonymousClass1.L$0;
                        dv8.b(compressedMediaData);
                    }
                    networkResponse = (NetworkResponse) compressedMediaData;
                    if (networkResponse instanceof NetworkResponse.Success) {
                        Upload uploadBuild = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                        String publicUrl = uploadBuild.getPublicUrl();
                        publicUrl.getClass();
                        failure = new UploadResult.Success(mediaUploadRepository.buildBlockForMedia(media3, publicUrl, uploadBuild.getId()));
                    } else if (networkResponse instanceof NetworkResponse.ClientError) {
                        failure = new UploadResult.Failure(new UploadError.ClientError(((NetworkResponse.ClientError) networkResponse).getError()));
                    } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                        failure = new UploadResult.Failure(new UploadError.NetworkError(((NetworkResponse.NetworkError) networkResponse).getError()));
                    } else {
                        if (networkResponse instanceof NetworkResponse.ServerError) {
                            throw new ib7();
                        }
                        failure = new UploadResult.Failure(new UploadError.ServerError(((NetworkResponse.ServerError) networkResponse).getCode()));
                    }
                    if (media3 != null) {
                        return failure;
                    }
                    uri = media3.getUri();
                    MediaCompressionKt.deleteCompressedMedia(uri);
                    return failure;
                    if (media2.getSize() <= mediaUploadRepository.attachmentSettings.invoke().getUploadSizeLimit()) {
                        ConversationRepository conversationRepository = mediaUploadRepository.conversationRepository;
                        anonymousClass1.L$0 = mediaUploadRepository;
                        anonymousClass1.L$1 = media2;
                        anonymousClass1.label = 2;
                        Object objUploadMedia = conversationRepository.uploadMedia(media2, anonymousClass1);
                        if (objUploadMedia != v72Var) {
                            media3 = media2;
                            compressedMediaData = objUploadMedia;
                            networkResponse = (NetworkResponse) compressedMediaData;
                            if (networkResponse instanceof NetworkResponse.Success) {
                                Upload uploadBuild2 = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                                String publicUrl2 = uploadBuild2.getPublicUrl();
                                publicUrl2.getClass();
                                failure = new UploadResult.Success(mediaUploadRepository.buildBlockForMedia(media3, publicUrl2, uploadBuild2.getId()));
                            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                                failure = new UploadResult.Failure(new UploadError.ClientError(((NetworkResponse.ClientError) networkResponse).getError()));
                            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                                failure = new UploadResult.Failure(new UploadError.NetworkError(((NetworkResponse.NetworkError) networkResponse).getError()));
                            } else {
                                if (networkResponse instanceof NetworkResponse.ServerError) {
                                    throw new ib7();
                                }
                                failure = new UploadResult.Failure(new UploadError.ServerError(((NetworkResponse.ServerError) networkResponse).getCode()));
                            }
                            if (media3 != null) {
                                return failure;
                            }
                            uri = media3.getUri();
                        }
                        return v72Var;
                    }
                    failure = new UploadResult.Failure(new UploadError.SizeLimitExceeded(media2.getSize(), mediaUploadRepository.attachmentSettings.invoke().getUploadSizeLimit(), mediaUploadRepository.attachmentSettings.invoke().getUploadSizeLimitMB()));
                    uri = media2.getUri();
                    MediaCompressionKt.deleteCompressedMedia(uri);
                    return failure;
                } catch (Exception e) {
                    e = e;
                    media4 = media2;
                    UploadResult.Failure failure2 = new UploadResult.Failure(new UploadError.UnexpectedError(e));
                    if (media4 != null) {
                        MediaCompressionKt.deleteCompressedMedia(media4.getUri());
                    }
                    return failure2;
                } catch (Throwable th) {
                    th = th;
                    media4 = media2;
                    if (media4 != null) {
                        MediaCompressionKt.deleteCompressedMedia(media4.getUri());
                    }
                    throw th;
                }
                media2 = (MediaData.Media) compressedMediaData;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class UploadResult {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Failure extends UploadResult {
            public static final int $stable = 0;
            private final UploadError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(UploadError uploadError) {
                super(null);
                uploadError.getClass();
                this.error = uploadError;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, UploadError uploadError, int i, Object obj) {
                if ((i & 1) != 0) {
                    uploadError = failure.error;
                }
                return failure.copy(uploadError);
            }

            public final UploadError component1() {
                return this.error;
            }

            public final Failure copy(UploadError uploadError) {
                uploadError.getClass();
                return new Failure(uploadError);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && xj5.a(this.error, ((Failure) obj).error);
            }

            public final UploadError getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failure(error=" + this.error + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Success extends UploadResult {
            public static final int $stable = 8;
            private final Block.Builder block;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(Block.Builder builder) {
                super(null);
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

        public /* synthetic */ UploadResult(qq2 qq2Var) {
            this();
        }

        private UploadResult() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class UploadError {
        public static final int $stable = 0;
        private final boolean canRetry;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ClientError extends UploadError {
            public static final int $stable = 8;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClientError(Throwable th) {
                super(false, 1, null);
                th.getClass();
                this.throwable = th;
            }

            public static /* synthetic */ ClientError copy$default(ClientError clientError, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = clientError.throwable;
                }
                return clientError.copy(th);
            }

            public final Throwable component1() {
                return this.throwable;
            }

            public final ClientError copy(Throwable th) {
                th.getClass();
                return new ClientError(th);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientError) && xj5.a(this.throwable, ((ClientError) obj).throwable);
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "ClientError(throwable=" + this.throwable + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class NetworkError extends UploadError {
            public static final int $stable = 8;
            private final IOException exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(IOException iOException) {
                super(false, 1, null);
                iOException.getClass();
                this.exception = iOException;
            }

            public static /* synthetic */ NetworkError copy$default(NetworkError networkError, IOException iOException, int i, Object obj) {
                if ((i & 1) != 0) {
                    iOException = networkError.exception;
                }
                return networkError.copy(iOException);
            }

            public final IOException component1() {
                return this.exception;
            }

            public final NetworkError copy(IOException iOException) {
                iOException.getClass();
                return new NetworkError(iOException);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NetworkError) && xj5.a(this.exception, ((NetworkError) obj).exception);
            }

            public final IOException getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "NetworkError(exception=" + this.exception + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ServerError extends UploadError {
            public static final int $stable = 0;
            private final int code;

            public ServerError(int i) {
                super(false, 1, null);
                this.code = i;
            }

            public static /* synthetic */ ServerError copy$default(ServerError serverError, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = serverError.code;
                }
                return serverError.copy(i);
            }

            public final int component1() {
                return this.code;
            }

            public final ServerError copy(int i) {
                return new ServerError(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServerError) && this.code == ((ServerError) obj).code;
            }

            public final int getCode() {
                return this.code;
            }

            public int hashCode() {
                return Integer.hashCode(this.code);
            }

            public String toString() {
                return e44.a(new StringBuilder("ServerError(code="), this.code, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class SizeLimitExceeded extends UploadError {
            public static final int $stable = 0;
            private final long limit;
            private final String limitMB;
            private final long size;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SizeLimitExceeded(long j, long j2, String str) {
                super(false, null);
                str.getClass();
                this.size = j;
                this.limit = j2;
                this.limitMB = str;
            }

            public static /* synthetic */ SizeLimitExceeded copy$default(SizeLimitExceeded sizeLimitExceeded, long j, long j2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = sizeLimitExceeded.size;
                }
                long j3 = j;
                if ((i & 2) != 0) {
                    j2 = sizeLimitExceeded.limit;
                }
                long j4 = j2;
                if ((i & 4) != 0) {
                    str = sizeLimitExceeded.limitMB;
                }
                return sizeLimitExceeded.copy(j3, j4, str);
            }

            public final long component1() {
                return this.size;
            }

            public final long component2() {
                return this.limit;
            }

            public final String component3() {
                return this.limitMB;
            }

            public final SizeLimitExceeded copy(long j, long j2, String str) {
                str.getClass();
                return new SizeLimitExceeded(j, j2, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SizeLimitExceeded)) {
                    return false;
                }
                SizeLimitExceeded sizeLimitExceeded = (SizeLimitExceeded) obj;
                return this.size == sizeLimitExceeded.size && this.limit == sizeLimitExceeded.limit && xj5.a(this.limitMB, sizeLimitExceeded.limitMB);
            }

            public final long getLimit() {
                return this.limit;
            }

            public final String getLimitMB() {
                return this.limitMB;
            }

            public final long getSize() {
                return this.size;
            }

            public int hashCode() {
                return this.limitMB.hashCode() + al.c(this.limit, Long.hashCode(this.size) * 31, 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SizeLimitExceeded(size=");
                sb.append(this.size);
                sb.append(", limit=");
                sb.append(this.limit);
                sb.append(", limitMB=");
                return wu0.a(sb, this.limitMB, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class UnexpectedError extends UploadError {
            public static final int $stable = 8;
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnexpectedError(Exception exc) {
                super(false, 1, null);
                exc.getClass();
                this.exception = exc;
            }

            public static /* synthetic */ UnexpectedError copy$default(UnexpectedError unexpectedError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = unexpectedError.exception;
                }
                return unexpectedError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final UnexpectedError copy(Exception exc) {
                exc.getClass();
                return new UnexpectedError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnexpectedError) && xj5.a(this.exception, ((UnexpectedError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "UnexpectedError(exception=" + this.exception + ')';
            }
        }

        public /* synthetic */ UploadError(boolean z, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? true : z, null);
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        private UploadError(boolean z) {
            this.canRetry = z;
        }

        public /* synthetic */ UploadError(boolean z, qq2 qq2Var) {
            this(z);
        }
    }

    public MediaUploadRepository(ConversationRepository conversationRepository, Context context, mh4<AttachmentSettings> mh4Var) {
        conversationRepository.getClass();
        context.getClass();
        mh4Var.getClass();
        this.conversationRepository = conversationRepository;
        this.applicationContext = context;
        this.attachmentSettings = mh4Var;
    }
}
