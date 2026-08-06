package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import defpackage.ct1;
import defpackage.o21;
import defpackage.qu8;
import defpackage.sk0;
import defpackage.su8;
import defpackage.v21;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class Video implements VideoBlock {
    private final Api api;
    private final StyleType style;
    private final Twig twig = LumberMill.getLogger();

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class AnonymousClass2 implements v21 {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public AnonymousClass2(VideoPreviewView videoPreviewView, ImageView imageView, String str) {
            this.val$previewView = videoPreviewView;
            this.val$videoImageView = imageView;
            this.val$id = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, ct1.a("https://player.vimeo.com/video/", str), str2);
        }

        @Override // defpackage.v21
        public void onFailure(o21 o21Var, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // defpackage.v21
        public void onResponse(o21 o21Var, qu8 qu8Var) {
            boolean z = qu8Var.J;
            su8 su8Var = qu8Var.z;
            if (z) {
                try {
                    if (su8Var != null) {
                        final String string = new JSONArray(su8Var.t()).getJSONObject(0).getString("thumbnail_large");
                        ImageView imageView = this.val$videoImageView;
                        final VideoPreviewView videoPreviewView = this.val$previewView;
                        final String str = this.val$id;
                        imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.t.lambda$onResponse$0(videoPreviewView, str, string);
                            }
                        });
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    Video.this.twig.internal("ErrorObject", "Couldn't read response body: " + e2.getMessage());
                } finally {
                    su8Var.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class AnonymousClass3 implements v21 {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public AnonymousClass3(VideoPreviewView videoPreviewView, String str, ImageView imageView) {
            this.val$previewView = videoPreviewView;
            this.val$id = str;
            this.val$videoImageView = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, str, str2);
        }

        @Override // defpackage.v21
        public void onFailure(o21 o21Var, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // defpackage.v21
        public void onResponse(o21 o21Var, qu8 qu8Var) {
            if (!qu8Var.J) {
                this.val$previewView.showFailedImage();
                return;
            }
            final String str = "https://www.useloom.com/embed/" + this.val$id;
            final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(qu8Var);
            ImageView imageView = this.val$videoImageView;
            final VideoPreviewView videoPreviewView = this.val$previewView;
            imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.lambda$onResponse$0(videoPreviewView, str, thumbnailUrlFromOembedResponse);
                }
            });
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider = iArr;
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.VIMEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Video(StyleType styleType, Api api) {
        this.style = styleType;
        this.api = api;
    }

    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Video.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    IntentUtils.safelyOpenIntent(imageView.getContext(), intent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getThumbnailUrlFromOembedResponse(qu8 qu8Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(qu8Var.z.t());
                    qu8Var.z.close();
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    e.printStackTrace();
                    qu8Var.z.close();
                }
            } catch (IOException e2) {
                this.twig.internal("ErrorObject", "Couldn't read response body: " + e2.getMessage());
                qu8Var.z.close();
            }
            String strOptString = jSONObject.optString("thumbnail_url");
            int iIndexOf = strOptString.indexOf("?image_crop_resized");
            return iIndexOf > 0 ? strOptString.substring(0, iIndexOf) : strOptString;
        } catch (Throwable th) {
            qu8Var.z.close();
            throw th;
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock
    public View addVideo(String str, VideoProvider videoProvider, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        WebView webView = new WebView(context);
        BlockUtils.createLayoutParams(webView, -1, 480);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        String embedUrl = VideoUrlUtilKt.getEmbedUrl(videoProvider, str2);
        HashMap map = new HashMap();
        map.put("Referer", "https://" + context.getPackageName());
        webView.loadUrl(embedUrl, map);
        return webView;
    }

    public void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        videoPreviewView.displayThumbnail(str2);
        addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), str);
    }

    public void fetchThumbnail(VideoProvider videoProvider, final String str, final VideoPreviewView videoPreviewView) {
        final ImageView thumbnailImageView = videoPreviewView.getThumbnailImageView();
        int i = AnonymousClass5.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[videoProvider.ordinal()];
        if (i == 1) {
            this.api.getVideo(ct1.a("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/", str), new v21() { // from class: io.intercom.android.sdk.blocks.Video.1
                @Override // defpackage.v21
                public void onFailure(o21 o21Var, IOException iOException) {
                    videoPreviewView.showFailedImage();
                }

                @Override // defpackage.v21
                public void onResponse(o21 o21Var, qu8 qu8Var) {
                    if (!qu8Var.J) {
                        videoPreviewView.showFailedImage();
                        return;
                    }
                    final String str2 = "https://fast.wistia.net/embed/iframe/" + str;
                    final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(qu8Var);
                    thumbnailImageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Video.this.createThumbnail(videoPreviewView, str2, thumbnailUrlFromOembedResponse);
                        }
                    });
                }
            });
            return;
        }
        if (i == 2) {
            createThumbnail(videoPreviewView, ct1.a("https://www.youtube.com/watch?v=", str), sk0.c("https://img.youtube.com/vi/", str, "/default.jpg"));
            return;
        }
        if (i == 3) {
            this.api.getVideo(sk0.c("https://vimeo.com/api/v2/video/", str, ".json"), new AnonymousClass2(videoPreviewView, thumbnailImageView, str));
        } else {
            if (i != 4) {
                return;
            }
            this.api.getVideo(ct1.a("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/", str), new AnonymousClass3(videoPreviewView, str, thumbnailImageView));
        }
    }
}
