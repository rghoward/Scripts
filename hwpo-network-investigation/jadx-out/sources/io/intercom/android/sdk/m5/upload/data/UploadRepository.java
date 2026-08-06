package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.js7;
import defpackage.kh6;
import defpackage.n17;
import defpackage.pi6;
import defpackage.qi6;
import defpackage.qp8;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Upload;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadRepository {
    public static final int $stable = 8;
    private final Context context;
    private final ExternalUploadApi externalUploadApi;
    private final MessengerApi messengerApi;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.upload.data.UploadRepository", f = "UploadRepository.kt", l = {41, 47}, m = "uploadFile")
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
            return UploadRepository.this.uploadFile(null, this);
        }
    }

    public /* synthetic */ UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? Injector.get().getExternalUploadApi() : externalUploadApi, (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 8) != 0 ? Injector.get().getApplication() : context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object uploadFile(MediaData.Media media, r02<? super NetworkResponse<Upload.Builder>> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object obj;
        NetworkResponse networkResponse;
        NetworkResponse networkResponse2;
        UploadRepository uploadRepository = this;
        MediaData.Media media2 = media;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = uploadRepository.new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = uploadRepository.new AnonymousClass1(r02Var);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object uploadFileUrlSuspended = anonymousClass2.result;
        int i2 = anonymousClass2.label;
        v72 v72Var = v72.t;
        if (i2 != 0) {
            if (i2 == 1) {
                MediaData.Media media3 = (MediaData.Media) anonymousClass2.L$1;
                UploadRepository uploadRepository2 = (UploadRepository) anonymousClass2.L$0;
                dv8.b(uploadFileUrlSuspended);
                media2 = media3;
                uploadRepository = uploadRepository2;
            } else {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                networkResponse = (NetworkResponse) anonymousClass2.L$0;
                dv8.b(uploadFileUrlSuspended);
                obj = null;
            }
            networkResponse2 = (NetworkResponse) uploadFileUrlSuspended;
            if ((networkResponse2 instanceof NetworkResponse.ClientError) || (networkResponse2 instanceof NetworkResponse.NetworkError) || (networkResponse2 instanceof NetworkResponse.ServerError)) {
                return networkResponse2;
            }
            if (networkResponse2 instanceof NetworkResponse.Success) {
                return networkResponse;
            }
            u.b();
            return obj;
        }
        dv8.b(uploadFileUrlSuspended);
        kh6 kh6Var = new kh6();
        kh6Var.put("original_filename", media2.getFileName());
        kh6Var.put("size_in_bytes", new Long(media2.getSize()));
        kh6Var.put("content_type", media2.getMimeType());
        if (media2 instanceof MediaData.Media.Image) {
            MediaData.Media.Image image = (MediaData.Media.Image) media2;
            kh6Var.put("width", new Integer(image.getWidth()));
            kh6Var.put("height", new Integer(image.getHeight()));
            if (!image.getExifData().isEmpty()) {
                kh6Var.put("image_exif", image.getExifData());
            }
        }
        if (media2 instanceof MediaData.Media.Video) {
            MediaData.Media.Video video = (MediaData.Media.Video) media2;
            kh6Var.put("width", new Integer(video.getWidth()));
            kh6Var.put("height", new Integer(video.getHeight()));
        }
        qp8 defaultRequestBody$intercom_sdk_base_release = MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(qi6.i(new js7("upload", pi6.f(kh6Var)), new js7(Participant.USER_TYPE, uploadRepository.userIdentity.toMap()), new js7("include_metadata", Boolean.TRUE)));
        MessengerApi messengerApi = uploadRepository.messengerApi;
        anonymousClass2.L$0 = uploadRepository;
        anonymousClass2.L$1 = media2;
        anonymousClass2.label = 1;
        uploadFileUrlSuspended = messengerApi.getUploadFileUrlSuspended(defaultRequestBody$intercom_sdk_base_release, anonymousClass2);
        if (uploadFileUrlSuspended == v72Var) {
            return v72Var;
        }
        NetworkResponse networkResponse3 = (NetworkResponse) uploadFileUrlSuspended;
        if ((networkResponse3 instanceof NetworkResponse.ClientError) || (networkResponse3 instanceof NetworkResponse.NetworkError) || (networkResponse3 instanceof NetworkResponse.ServerError)) {
            return networkResponse3;
        }
        if (!(networkResponse3 instanceof NetworkResponse.Success)) {
            u.b();
            return null;
        }
        Upload uploadBuild = ((Upload.Builder) ((NetworkResponse.Success) networkResponse3).getBody()).build();
        ExternalUploadApi externalUploadApi = uploadRepository.externalUploadApi;
        String uploadDestination = uploadBuild.getUploadDestination();
        String key = uploadBuild.getKey();
        key.getClass();
        n17.c cVarA = n17.c.a.a("key", key);
        String acl = uploadBuild.getAcl();
        acl.getClass();
        n17.c cVarA2 = n17.c.a.a("acl", acl);
        String contentType = uploadBuild.getContentType();
        contentType.getClass();
        n17.c cVarA3 = n17.c.a.a("Content-Type", contentType);
        String awsAccessKey = uploadBuild.getAwsAccessKey();
        awsAccessKey.getClass();
        n17.c cVarA4 = n17.c.a.a("AWSAccessKeyId", awsAccessKey);
        String policy = uploadBuild.getPolicy();
        policy.getClass();
        n17.c cVarA5 = n17.c.a.a("policy", policy);
        String signature = uploadBuild.getSignature();
        signature.getClass();
        n17.c cVarA6 = n17.c.a.a("signature", signature);
        String successActionStatus = uploadBuild.getSuccessActionStatus();
        successActionStatus.getClass();
        n17.c cVarA7 = n17.c.a.a("success_action_status", successActionStatus);
        n17.c cVarA8 = n17.c.a.a("x-amz-meta-safe_app_id", uploadBuild.getMetadata().getSafeAppId());
        n17.c cVarB = n17.c.a.b("file", media2.getFileName(), new UploadRequestBody(uploadRepository.context, media2));
        anonymousClass2.L$0 = networkResponse3;
        anonymousClass2.L$1 = null;
        anonymousClass2.label = 2;
        obj = null;
        Object objUploadFileSuspended = externalUploadApi.uploadFileSuspended(uploadDestination, cVarA, cVarA2, cVarA3, cVarA4, cVarA5, cVarA6, cVarA7, cVarA8, cVarB, anonymousClass2);
        if (objUploadFileSuspended == v72Var) {
            return v72Var;
        }
        networkResponse = networkResponse3;
        uploadFileUrlSuspended = objUploadFileSuspended;
        networkResponse2 = (NetworkResponse) uploadFileUrlSuspended;
        if (networkResponse2 instanceof NetworkResponse.ClientError) {
            if (networkResponse2 instanceof NetworkResponse.Success) {
                return networkResponse;
            }
            u.b();
            return obj;
        }
        return networkResponse2;
    }

    public UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context) {
        messengerApi.getClass();
        externalUploadApi.getClass();
        userIdentity.getClass();
        context.getClass();
        this.messengerApi = messengerApi;
        this.externalUploadApi = externalUploadApi;
        this.userIdentity = userIdentity;
        this.context = context;
    }

    public UploadRepository() {
        this(null, null, null, null, 15, null);
    }
}
