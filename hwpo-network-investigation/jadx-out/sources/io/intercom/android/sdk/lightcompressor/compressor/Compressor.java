package io.intercom.android.sdk.lightcompressor.compressor;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i23;
import defpackage.js7;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import io.intercom.android.sdk.lightcompressor.CompressionProgressListener;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.utils.CompressorUtils;
import io.intercom.android.sdk.lightcompressor.utils.StreamableVideo;
import io.intercom.android.sdk.lightcompressor.video.InputSurface;
import io.intercom.android.sdk.lightcompressor.video.OutputSurface;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Compressor {
    private static final String INVALID_BITRATE = "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false";
    private static final long MEDIACODEC_TIMEOUT_DEFAULT = 100;
    private static final String MIME_TYPE = "video/avc";
    private static final int MIN_BITRATE = 2000000;
    public static final Compressor INSTANCE = new Compressor();
    private static boolean isRunning = true;

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2", f = "Compressor.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super Result>, Object> {
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $destination;
        final /* synthetic */ int $index;
        final /* synthetic */ CompressionProgressListener $listener;
        final /* synthetic */ Uri $srcUri;
        final /* synthetic */ String $streamableFile;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Uri uri, int i, Configuration configuration, String str, String str2, CompressionProgressListener compressionProgressListener, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$context = context;
            this.$srcUri = uri;
            this.$index = i;
            this.$configuration = configuration;
            this.$destination = str;
            this.$streamableFile = str2;
            this.$listener = compressionProgressListener;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$srcUri, this.$index, this.$configuration, this.$destination, this.$streamableFile, this.$listener, r02Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Result> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0127  */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int iIntValue;
            js7<Integer, Integer> js7VarGenerateWidthAndHeight;
            int i;
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            MediaExtractor mediaExtractor = new MediaExtractor();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.$context, this.$srcUri);
                try {
                    mediaExtractor.setDataSource(this.$context, this.$srcUri, (Map<String, String>) null);
                    g2b g2bVar = g2b.a;
                } catch (Throwable unused) {
                }
                CompressorUtils compressorUtils = CompressorUtils.INSTANCE;
                double dPrepareVideoHeight = compressorUtils.prepareVideoHeight(mediaMetadataRetriever);
                double dPrepareVideoWidth = compressorUtils.prepareVideoWidth(mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata == null || strExtractMetadata.length() == 0 || strExtractMetadata2 == null || strExtractMetadata2.length() == 0 || strExtractMetadata3 == null || strExtractMetadata3.length() == 0) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
                }
                try {
                    Integer num = new Integer(Integer.parseInt(strExtractMetadata));
                    Integer num2 = new Integer(Integer.parseInt(strExtractMetadata2));
                    Long l = new Long(Long.parseLong(strExtractMetadata3) * 1000);
                    int iIntValue2 = num.intValue();
                    int iIntValue3 = num2.intValue();
                    long jLongValue = l.longValue();
                    if (this.$configuration.isMinBitrateCheckEnabled() && iIntValue3 <= Compressor.MIN_BITRATE) {
                        return new Result(this.$index, false, Compressor.INVALID_BITRATE, 0L, null, 24, null);
                    }
                    Integer videoBitrateInMbps = this.$configuration.getVideoBitrateInMbps();
                    Configuration configuration = this.$configuration;
                    if (videoBitrateInMbps == null) {
                        iIntValue = compressorUtils.getBitrate(iIntValue3, configuration.getQuality());
                    } else {
                        Integer videoBitrateInMbps2 = configuration.getVideoBitrateInMbps();
                        videoBitrateInMbps2.getClass();
                        iIntValue = videoBitrateInMbps2.intValue() * 1000000;
                    }
                    Double videoHeight = this.$configuration.getVideoHeight();
                    Configuration configuration2 = this.$configuration;
                    if (videoHeight != null) {
                        Double videoWidth = configuration2.getVideoWidth();
                        Integer num3 = videoWidth != null ? new Integer((int) videoWidth.doubleValue()) : null;
                        Double videoHeight2 = this.$configuration.getVideoHeight();
                        js7VarGenerateWidthAndHeight = new js7<>(num3, videoHeight2 != null ? new Integer((int) videoHeight2.doubleValue()) : null);
                    } else {
                        js7VarGenerateWidthAndHeight = compressorUtils.generateWidthAndHeight(dPrepareVideoWidth, dPrepareVideoHeight, configuration2.getKeepOriginalResolution());
                    }
                    Integer num4 = js7VarGenerateWidthAndHeight.t;
                    Integer num5 = js7VarGenerateWidthAndHeight.u;
                    if (iIntValue2 == 90) {
                        num5 = num4;
                        num4 = num5;
                        i = 0;
                    } else if (iIntValue2 == 180) {
                        i = 0;
                    } else if (iIntValue2 != 270) {
                        i = iIntValue2;
                    } else {
                        num5 = num4;
                        num4 = num5;
                        i = 0;
                    }
                    Compressor compressor = Compressor.INSTANCE;
                    Integer num6 = num5;
                    int i2 = this.$index;
                    num4.getClass();
                    int iIntValue4 = num4.intValue();
                    num6.getClass();
                    return compressor.start(i2, iIntValue4, num6.intValue(), this.$destination, iIntValue, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, jLongValue, i);
                } catch (Exception unused2) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
                }
            } catch (IllegalArgumentException e) {
                CompressorUtils.INSTANCE.printException(e);
                return new Result(this.$index, false, String.valueOf(e.getMessage()), 0L, null, 24, null);
            }
        }
    }

    private Compressor() {
    }

    private final int addAudioTrack(MediaMuxer mediaMuxer, boolean z, MediaExtractor mediaExtractor) {
        int iFindTrack = CompressorUtils.INSTANCE.findTrack(mediaExtractor, false);
        if (iFindTrack < 0 || z) {
            return -1;
        }
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
        trackFormat.getClass();
        return mediaMuxer.addTrack(trackFormat);
    }

    private final void dispose(int i, MediaCodec mediaCodec, MediaCodec mediaCodec2, InputSurface inputSurface, OutputSurface outputSurface, MediaExtractor mediaExtractor) {
        mediaExtractor.unselectTrack(i);
        mediaCodec.stop();
        mediaCodec.release();
        mediaCodec2.stop();
        mediaCodec2.release();
        inputSurface.release();
        outputSurface.release();
    }

    private final MediaCodec prepareDecoder(MediaFormat mediaFormat, OutputSurface outputSurface) throws IOException {
        String string = mediaFormat.getString("mime");
        string.getClass();
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        mediaCodecCreateDecoderByType.getClass();
        mediaCodecCreateDecoderByType.configure(mediaFormat, outputSurface.getSurface(), (MediaCrypto) null, 0);
        return mediaCodecCreateDecoderByType;
    }

    private final MediaCodec prepareEncoder(MediaFormat mediaFormat, boolean z) throws IOException {
        MediaCodec mediaCodecCreateByCodecName = z ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(MIME_TYPE);
        mediaCodecCreateByCodecName.getClass();
        try {
            mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return mediaCodecCreateByCodecName;
        } catch (Exception unused) {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(MIME_TYPE);
            mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return mediaCodecCreateEncoderByType;
        }
    }

    private final void processAudio(MediaMuxer mediaMuxer, int i, MediaCodec.BufferInfo bufferInfo, boolean z, MediaExtractor mediaExtractor) {
        int sampleSize;
        int iFindTrack = CompressorUtils.INSTANCE.findTrack(mediaExtractor, false);
        if (iFindTrack < 0 || z || i < 0) {
            return;
        }
        mediaExtractor.selectTrack(iFindTrack);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
        trackFormat.getClass();
        int integer = trackFormat.getInteger("max-input-size");
        if (integer <= 0) {
            integer = 65536;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(integer);
        byteBufferAllocateDirect.getClass();
        if (Build.VERSION.SDK_INT >= 28 && (sampleSize = (int) mediaExtractor.getSampleSize()) > integer) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(sampleSize + 1024);
        }
        mediaExtractor.seekTo(0L, 0);
        boolean z2 = false;
        while (!z2) {
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == iFindTrack) {
                int sampleData = mediaExtractor.readSampleData(byteBufferAllocateDirect, 0);
                bufferInfo.size = sampleData;
                if (sampleData >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.offset = 0;
                    bufferInfo.flags = 1;
                    mediaMuxer.writeSampleData(i, byteBufferAllocateDirect, bufferInfo);
                    mediaExtractor.advance();
                } else {
                    bufferInfo.size = 0;
                    z2 = true;
                }
            } else if (sampleTrackIndex == -1) {
                z2 = true;
            }
        }
        mediaExtractor.unselectTrack(iFindTrack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:117:0x0280  */
    /* JADX WARN: Code duplicated, block: B:148:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x014e A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:42:0x0109, B:46:0x0125, B:85:0x01ef, B:94:0x020d, B:98:0x0214, B:101:0x021c, B:50:0x014e, B:52:0x0158, B:54:0x015f, B:57:0x016c, B:64:0x018c, B:66:0x0192, B:68:0x0197, B:71:0x019f, B:72:0x01a2, B:77:0x01af, B:79:0x01b7, B:80:0x01d2, B:81:0x01d3, B:82:0x01e9), top: B:148:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0158 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:42:0x0109, B:46:0x0125, B:85:0x01ef, B:94:0x020d, B:98:0x0214, B:101:0x021c, B:50:0x014e, B:52:0x0158, B:54:0x015f, B:57:0x016c, B:64:0x018c, B:66:0x0192, B:68:0x0197, B:71:0x019f, B:72:0x01a2, B:77:0x01af, B:79:0x01b7, B:80:0x01d2, B:81:0x01d3, B:82:0x01e9), top: B:148:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x015f A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:42:0x0109, B:46:0x0125, B:85:0x01ef, B:94:0x020d, B:98:0x0214, B:101:0x021c, B:50:0x014e, B:52:0x0158, B:54:0x015f, B:57:0x016c, B:64:0x018c, B:66:0x0192, B:68:0x0197, B:71:0x019f, B:72:0x01a2, B:77:0x01af, B:79:0x01b7, B:80:0x01d2, B:81:0x01d3, B:82:0x01e9), top: B:148:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x016c A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:42:0x0109, B:46:0x0125, B:85:0x01ef, B:94:0x020d, B:98:0x0214, B:101:0x021c, B:50:0x014e, B:52:0x0158, B:54:0x015f, B:57:0x016c, B:64:0x018c, B:66:0x0192, B:68:0x0197, B:71:0x019f, B:72:0x01a2, B:77:0x01af, B:79:0x01b7, B:80:0x01d2, B:81:0x01d3, B:82:0x01e9), top: B:148:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x017a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:63:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x018c A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:42:0x0109, B:46:0x0125, B:85:0x01ef, B:94:0x020d, B:98:0x0214, B:101:0x021c, B:50:0x014e, B:52:0x0158, B:54:0x015f, B:57:0x016c, B:64:0x018c, B:66:0x0192, B:68:0x0197, B:71:0x019f, B:72:0x01a2, B:77:0x01af, B:79:0x01b7, B:80:0x01d2, B:81:0x01d3, B:82:0x01e9), top: B:148:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0192 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:42:0x0109, B:46:0x0125, B:85:0x01ef, B:94:0x020d, B:98:0x0214, B:101:0x021c, B:50:0x014e, B:52:0x0158, B:54:0x015f, B:57:0x016c, B:64:0x018c, B:66:0x0192, B:68:0x0197, B:71:0x019f, B:72:0x01a2, B:77:0x01af, B:79:0x01b7, B:80:0x01d2, B:81:0x01d3, B:82:0x01e9), top: B:148:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ef A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:42:0x0109, B:46:0x0125, B:85:0x01ef, B:94:0x020d, B:98:0x0214, B:101:0x021c, B:50:0x014e, B:52:0x0158, B:54:0x015f, B:57:0x016c, B:64:0x018c, B:66:0x0192, B:68:0x0197, B:71:0x019f, B:72:0x01a2, B:77:0x01af, B:79:0x01b7, B:80:0x01d2, B:81:0x01d3, B:82:0x01e9), top: B:148:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r16v9, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.lightcompressor.compressor.Compressor] */
    /* JADX WARN: Type inference failed for: r1v10, types: [io.intercom.android.sdk.lightcompressor.compressor.Compressor] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [io.intercom.android.sdk.lightcompressor.compressor.Compressor] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Result start(int i, int i2, int i3, String str, int i4, String str2, boolean z, MediaExtractor mediaExtractor, CompressionProgressListener compressionProgressListener, long j, int i5) throws Throwable {
        ?? r9;
        MediaMuxer mediaMuxer;
        MediaCodec mediaCodec;
        ?? r16;
        boolean z2;
        boolean z3;
        ?? r17;
        ?? r8;
        boolean z4;
        ?? r3;
        int i6;
        boolean z5;
        int i7;
        int iDequeueOutputBuffer;
        ByteBuffer outputBuffer;
        boolean z6;
        int i8;
        MediaFormat outputFormat;
        int iAddTrack;
        ?? r10;
        ?? r11;
        int iDequeueOutputBuffer2;
        ?? r12;
        ?? r13;
        ?? r1;
        int iDequeueInputBuffer;
        ?? r2;
        ?? r18;
        ?? r4 = this;
        ?? r14 = i;
        if (i2 == 0 || i3 == 0) {
            return new Result(i, false, "Something went wrong, please try again", 0L, null, 24, null);
        }
        File file = new File(str);
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            MediaMuxer mediaMuxer2 = new MediaMuxer(str, 0);
            if (i5 != 0) {
                mediaMuxer2.setOrientationHint(i5);
            }
            CompressorUtils compressorUtils = CompressorUtils.INSTANCE;
            int iFindTrack = compressorUtils.findTrack(mediaExtractor, true);
            mediaExtractor.selectTrack(iFindTrack);
            mediaExtractor.seekTo(0L, 0);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
            trackFormat.getClass();
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MIME_TYPE, i2, i3);
            mediaFormatCreateVideoFormat.getClass();
            compressorUtils.setOutputFileParameters(trackFormat, mediaFormatCreateVideoFormat, i4);
            MediaCodec mediaCodecPrepareEncoder = r4.prepareEncoder(mediaFormatCreateVideoFormat, compressorUtils.hasQTI());
            try {
                InputSurface inputSurface = new InputSurface(mediaCodecPrepareEncoder.createInputSurface());
                inputSurface.makeCurrent();
                mediaCodecPrepareEncoder.start();
                OutputSurface outputSurface = new OutputSurface();
                MediaCodec mediaCodecPrepareDecoder = r4.prepareDecoder(trackFormat, outputSurface);
                mediaCodecPrepareDecoder.start();
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                int iAddAudioTrack = -1;
                int i9 = -5;
                ?? r5 = r4;
                ?? r6 = mediaCodecPrepareDecoder;
                r14 = r14;
                while (!z7) {
                    if (z8) {
                        mediaCodec = mediaCodecPrepareEncoder;
                    } else {
                        int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                        if (sampleTrackIndex == iFindTrack) {
                            mediaCodec = mediaCodecPrepareEncoder;
                            int iDequeueInputBuffer2 = r6.dequeueInputBuffer(MEDIACODEC_TIMEOUT_DEFAULT);
                            if (iDequeueInputBuffer2 >= 0) {
                                ByteBuffer inputBuffer = r6.getInputBuffer(iDequeueInputBuffer2);
                                inputBuffer.getClass();
                                int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                                if (sampleData < 0) {
                                    ?? r19 = r6;
                                    r19.queueInputBuffer(iDequeueInputBuffer2, 0, 0, 0L, 4);
                                    r18 = r19;
                                    z8 = true;
                                    r16 = r18;
                                } else {
                                    ?? r110 = r6;
                                    r110.queueInputBuffer(iDequeueInputBuffer2, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                                    r2 = r110;
                                    mediaExtractor.advance();
                                    r2 = r1;
                                    r2 = r1;
                                    r2 = r1;
                                    r16 = r2;
                                }
                            }
                        } else {
                            mediaCodec = mediaCodecPrepareEncoder;
                            r1 = r6;
                            if (sampleTrackIndex != -1 || (iDequeueInputBuffer = r1.dequeueInputBuffer(MEDIACODEC_TIMEOUT_DEFAULT)) < 0) {
                                r2 = r1;
                                r2 = r1;
                                r2 = r1;
                                r16 = r2;
                            } else {
                                r2 = r1;
                                r2 = r1;
                                ?? r111 = r1;
                                r111.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                r18 = r111;
                                z8 = true;
                                r16 = r18;
                            }
                        }
                        z2 = true;
                        z3 = true;
                        r8 = r14;
                        r17 = r16;
                        while (true) {
                            if (!z2 && !z3) {
                                break;
                            }
                            if (!isRunning) {
                                dispose(iFindTrack, r17, mediaCodec, inputSurface, outputSurface, mediaExtractor);
                                compressionProgressListener.onProgressCancelled(r8 == true ? 1 : 0);
                                return new Result(i, false, "The compression has stopped!", 0L, null, 24, null);
                            }
                            try {
                                z4 = z7;
                                InputSurface inputSurface2 = inputSurface;
                                r3 = r17;
                                i6 = iAddAudioTrack;
                                iFindTrack = iFindTrack;
                                mediaCodec = mediaCodec;
                                z5 = z2;
                                i7 = i9;
                                iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                                if (iDequeueOutputBuffer == -1) {
                                    z7 = z4;
                                    iAddAudioTrack = i6;
                                    i9 = i7;
                                    z3 = false;
                                    i8 = -1;
                                    z6 = false;
                                } else {
                                    if (iDequeueOutputBuffer == -2) {
                                        outputFormat = mediaCodec.getOutputFormat();
                                        outputFormat.getClass();
                                        if (i7 == -5) {
                                            iAddTrack = mediaMuxer2.addTrack(outputFormat);
                                            if (i6 == -1) {
                                                iAddAudioTrack = addAudioTrack(mediaMuxer2, z, mediaExtractor);
                                            } else {
                                                iAddAudioTrack = i6;
                                            }
                                            if (z9) {
                                                z7 = z4;
                                                i9 = iAddTrack;
                                                z6 = false;
                                                i8 = -1;
                                            } else {
                                                mediaMuxer2.start();
                                                z7 = z4;
                                                i9 = iAddTrack;
                                                z6 = false;
                                                i8 = -1;
                                                z9 = true;
                                            }
                                        }
                                    } else {
                                        if (iDequeueOutputBuffer != -3) {
                                            if (iDequeueOutputBuffer >= 0) {
                                                throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                            }
                                            outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                                            if (outputBuffer != null) {
                                                throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                            }
                                            if (bufferInfo.size > 1 && (bufferInfo.flags & 2) == 0 && z9) {
                                                mediaMuxer2.writeSampleData(i7, outputBuffer, bufferInfo);
                                            }
                                            if ((bufferInfo.flags & 4) != 0) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            z6 = false;
                                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                        }
                                        iAddAudioTrack = i6;
                                        i9 = i7;
                                        i8 = -1;
                                    }
                                    z6 = false;
                                    z7 = z4;
                                    iAddAudioTrack = i6;
                                    i9 = i7;
                                    i8 = -1;
                                }
                                if (iDequeueOutputBuffer != i8) {
                                    r10 = i;
                                    z2 = z5;
                                    r11 = r10;
                                } else {
                                    iDequeueOutputBuffer2 = r3.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                                    if (iDequeueOutputBuffer2 == i8) {
                                        z2 = z6;
                                        r11 = i;
                                    } else {
                                        if (iDequeueOutputBuffer2 == -3 && iDequeueOutputBuffer2 != -2) {
                                            if (iDequeueOutputBuffer2 < 0) {
                                                r12 = i;
                                                throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer2);
                                            }
                                            r12 = bufferInfo.size != 0 ? 1 : z6;
                                            r3.releaseOutputBuffer(iDequeueOutputBuffer2, r12);
                                            if (r12 != 0) {
                                                try {
                                                    outputSurface.awaitNewImage();
                                                    outputSurface.drawImage();
                                                    inputSurface2.setPresentationTime(bufferInfo.presentationTimeUs * 1000);
                                                    r12 = i;
                                                    try {
                                                        compressionProgressListener.onProgressChanged(r12 == true ? 1 : 0, (bufferInfo.presentationTimeUs / j) * 100.0f);
                                                        inputSurface2.swapBuffers();
                                                        r13 = r12;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        r9 = r12;
                                                    }
                                                } catch (Exception e2) {
                                                    r13 = i;
                                                    String message = e2.getMessage();
                                                    if (message == null) {
                                                        message = "Compression failed at swapping buffer";
                                                    }
                                                    Log.e("Compressor", message);
                                                }
                                            } else {
                                                r13 = i;
                                            }
                                            r10 = r13;
                                            if ((bufferInfo.flags & 4) != 0) {
                                                mediaCodec.signalEndOfInputStream();
                                                r11 = r13 == true ? 1 : 0;
                                                z2 = false;
                                            }
                                            e = e;
                                            r9 = r12;
                                            CompressorUtils.INSTANCE.printException(e);
                                            return new Result(r9 == true ? 1 : 0, false, e.getMessage(), 0L, null, 24, null);
                                        }
                                        r10 = i;
                                        z2 = z5;
                                        r11 = r10;
                                    }
                                }
                                r17 = r3;
                                inputSurface = inputSurface2;
                                r8 = r11;
                            } catch (Exception e3) {
                                e = e3;
                                r9 = i;
                            }
                        }
                        r5 = this;
                        mediaCodecPrepareEncoder = mediaCodec;
                        r6 = r17;
                        r14 = r8;
                    }
                    r16 = r6;
                    z2 = true;
                    z3 = true;
                    r8 = r14;
                    r17 = r16;
                    while (true) {
                        if (!z2) {
                        }
                        if (!isRunning) {
                            dispose(iFindTrack, r17, mediaCodec, inputSurface, outputSurface, mediaExtractor);
                            compressionProgressListener.onProgressCancelled(r8 == true ? 1 : 0);
                            return new Result(i, false, "The compression has stopped!", 0L, null, 24, null);
                        }
                        z4 = z7;
                        InputSurface inputSurface3 = inputSurface;
                        r3 = r17;
                        i6 = iAddAudioTrack;
                        iFindTrack = iFindTrack;
                        mediaCodec = mediaCodec;
                        z5 = z2;
                        i7 = i9;
                        iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                        if (iDequeueOutputBuffer == -1) {
                            z7 = z4;
                            iAddAudioTrack = i6;
                            i9 = i7;
                            z3 = false;
                            i8 = -1;
                            z6 = false;
                        } else {
                            if (iDequeueOutputBuffer == -2) {
                                outputFormat = mediaCodec.getOutputFormat();
                                outputFormat.getClass();
                                if (i7 == -5) {
                                    iAddTrack = mediaMuxer2.addTrack(outputFormat);
                                    if (i6 == -1) {
                                        iAddAudioTrack = addAudioTrack(mediaMuxer2, z, mediaExtractor);
                                    } else {
                                        iAddAudioTrack = i6;
                                    }
                                    if (z9) {
                                        mediaMuxer2.start();
                                        z7 = z4;
                                        i9 = iAddTrack;
                                        z6 = false;
                                        i8 = -1;
                                        z9 = true;
                                    } else {
                                        z7 = z4;
                                        i9 = iAddTrack;
                                        z6 = false;
                                        i8 = -1;
                                    }
                                }
                            } else {
                                if (iDequeueOutputBuffer != -3) {
                                    if (iDequeueOutputBuffer >= 0) {
                                        throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                    }
                                    outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                                    if (outputBuffer != null) {
                                        throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                    }
                                    if (bufferInfo.size > 1) {
                                        mediaMuxer2.writeSampleData(i7, outputBuffer, bufferInfo);
                                    }
                                    if ((bufferInfo.flags & 4) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    z6 = false;
                                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                }
                                iAddAudioTrack = i6;
                                i9 = i7;
                                i8 = -1;
                            }
                            z6 = false;
                            z7 = z4;
                            iAddAudioTrack = i6;
                            i9 = i7;
                            i8 = -1;
                        }
                        if (iDequeueOutputBuffer != i8) {
                            r10 = i;
                            z2 = z5;
                            r11 = r10;
                        } else {
                            iDequeueOutputBuffer2 = r3.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                            if (iDequeueOutputBuffer2 == i8) {
                                z2 = z6;
                                r11 = i;
                            } else if (iDequeueOutputBuffer2 == -3) {
                                r10 = i;
                                z2 = z5;
                                r11 = r10;
                            } else {
                                r10 = i;
                                z2 = z5;
                                r11 = r10;
                            }
                        }
                        r17 = r3;
                        inputSurface = inputSurface3;
                        r8 = r11;
                    }
                    r5 = this;
                    mediaCodecPrepareEncoder = mediaCodec;
                    r6 = r17;
                    r14 = r8;
                }
                int i10 = iFindTrack;
                MediaCodec mediaCodec2 = mediaCodecPrepareEncoder;
                ?? r15 = r6;
                InputSurface inputSurface4 = inputSurface;
                boolean z10 = r14 == true ? 1 : 0;
                r5.dispose(i10, r15, mediaCodec2, inputSurface4, outputSurface, mediaExtractor);
                if (z9) {
                    mediaMuxer = mediaMuxer2;
                    processAudio(mediaMuxer, iAddAudioTrack, bufferInfo, z, mediaExtractor);
                } else {
                    mediaMuxer = mediaMuxer2;
                }
                mediaExtractor.release();
                try {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                } catch (Exception e4) {
                    CompressorUtils.INSTANCE.printException(e4);
                }
                if (str2 != null) {
                    try {
                        boolean zStart = StreamableVideo.INSTANCE.start(file, new File(str2));
                        File file2 = new File(str2);
                        if (zStart) {
                            try {
                                if (file.exists()) {
                                    file.delete();
                                }
                            } catch (Exception e5) {
                                e = e5;
                                file = file2;
                                CompressorUtils.INSTANCE.printException(e);
                            }
                        }
                        file = file2;
                    } catch (Exception e6) {
                        e = e6;
                    }
                }
                return new Result(i, true, null, file.length(), file.getPath());
            } catch (Exception e7) {
                e = e7;
                r9 = r14;
            }
        } catch (Exception e8) {
            CompressorUtils.INSTANCE.printException(e8);
        }
    }

    public final Object compressVideo(int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionProgressListener compressionProgressListener, r02<? super Result> r02Var) {
        return oy0.g(i23.a, new AnonymousClass2(context, uri, i, configuration, str, str2, compressionProgressListener, null), r02Var);
    }

    public final boolean isRunning() {
        return isRunning;
    }

    public final void setRunning(boolean z) {
        isRunning = z;
    }
}
