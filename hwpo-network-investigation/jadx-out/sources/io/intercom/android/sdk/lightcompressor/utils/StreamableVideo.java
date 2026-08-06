package io.intercom.android.sdk.lightcompressor.utils;

import android.util.Log;
import defpackage.g2b;
import io.intercom.android.sdk.lightcompressor.data.AtomsKt;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class StreamableVideo {
    private static final int ATOM_PREAMBLE_SIZE = 8;
    public static final StreamableVideo INSTANCE = new StreamableVideo();
    private static final String tag = "StreamableVideo";

    private StreamableVideo() {
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    private final boolean convert(FileChannel fileChannel, FileChannel fileChannel2) throws Exception {
        boolean z;
        long j;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long jUInt32ToLong = 0;
        ByteBuffer byteBuffer = null;
        int i = 0;
        long jPosition = 0;
        do {
            byteBufferOrder.getClass();
            if (!readAndFill(fileChannel, byteBufferOrder)) {
                z = false;
                break;
            }
            jUInt32ToLong = NumbersUtilsKt.uInt32ToLong(byteBufferOrder.getInt());
            i = byteBufferOrder.getInt();
            if (i == AtomsKt.getFTYP_ATOM()) {
                int iUInt32ToInt = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
                z = false;
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(iUInt32ToInt).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.rewind();
                byteBufferOrder2.put(byteBufferOrder);
                if (fileChannel.read(byteBufferOrder2) < iUInt32ToInt - 8) {
                    byteBuffer = byteBufferOrder2;
                    break;
                }
                byteBufferOrder2.flip();
                jPosition = fileChannel.position();
                g2b g2bVar = g2b.a;
                byteBuffer = byteBufferOrder2;
                j = 8;
                if (i == AtomsKt.getFREE_ATOM() && i != AtomsKt.getJUNK_ATOM() && i != AtomsKt.getMDAT_ATOM() && i != AtomsKt.getMOOV_ATOM() && i != AtomsKt.getPNOT_ATOM() && i != AtomsKt.getSKIP_ATOM() && i != AtomsKt.getWIDE_ATOM() && i != AtomsKt.getPICT_ATOM() && i != AtomsKt.getUUID_ATOM() && i != AtomsKt.getFTYP_ATOM()) {
                    Log.wtf(tag, "encountered non-QT top-level atom (is this a QuickTime file?)");
                    break;
                }
            } else {
                z = false;
                if (jUInt32ToLong == 1) {
                    byteBufferOrder.clear();
                    if (!readAndFill(fileChannel, byteBufferOrder)) {
                        break;
                    }
                    jUInt32ToLong = NumbersUtilsKt.uInt64ToLong(byteBufferOrder.getLong());
                    j = 8;
                    fileChannel.position((fileChannel.position() + jUInt32ToLong) - 16);
                } else {
                    j = 8;
                    fileChannel.position((fileChannel.position() + jUInt32ToLong) - 8);
                }
                if (i == AtomsKt.getFREE_ATOM()) {
                }
            }
        } while (jUInt32ToLong >= j);
        if (i != AtomsKt.getMOOV_ATOM()) {
            Log.wtf(tag, "last atom in file was not a moov atom");
            return z;
        }
        int iUInt32ToInt2 = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
        long j2 = iUInt32ToInt2;
        long size = fileChannel.size() - j2;
        ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(iUInt32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (!readAndFill(fileChannel, byteBufferOrder3, size)) {
            throw new Exception("failed to read moov atom");
        }
        if (byteBufferOrder3.getInt(12) == AtomsKt.getCMOV_ATOM()) {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
        for (int i2 = 8; byteBufferOrder3.remaining() >= i2; i2 = 8) {
            int iPosition = byteBufferOrder3.position();
            int i3 = byteBufferOrder3.getInt(iPosition + 4);
            if (i3 == AtomsKt.getSTCO_ATOM() || i3 == AtomsKt.getCO64_ATOM()) {
                int i4 = iUInt32ToInt2;
                if (NumbersUtilsKt.uInt32ToLong(byteBufferOrder3.getInt(iPosition)) > byteBufferOrder3.remaining()) {
                    throw new Exception("bad atom size");
                }
                byteBufferOrder3.position(iPosition + 12);
                if (byteBufferOrder3.remaining() < 4) {
                    throw new Exception("malformed atom");
                }
                int iUInt32ToInt3 = NumbersUtilsKt.uInt32ToInt(byteBufferOrder3.getInt());
                if (i3 == AtomsKt.getSTCO_ATOM()) {
                    Log.i(tag, "patching stco atom...");
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 4) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (?? r2 = z; r2 < iUInt32ToInt3; r2++) {
                        int i5 = byteBufferOrder3.getInt(byteBufferOrder3.position());
                        int i6 = i5 + i4;
                        if (i5 < 0 && i6 >= 0) {
                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                        }
                        byteBufferOrder3.putInt(i6);
                    }
                } else if (i3 == AtomsKt.getCO64_ATOM()) {
                    Log.wtf(tag, "patching co64 atom...");
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 8) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (?? r3 = z; r3 < iUInt32ToInt3; r3++) {
                        byteBufferOrder3.putLong(byteBufferOrder3.getLong(byteBufferOrder3.position()) + j2);
                    }
                }
                iUInt32ToInt2 = i4;
            } else {
                byteBufferOrder3.position(byteBufferOrder3.position() + 1);
            }
        }
        fileChannel.position(jPosition);
        if (byteBuffer != null) {
            Log.i(tag, "writing ftyp atom...");
            byteBuffer.rewind();
            fileChannel2.write(byteBuffer);
        }
        Log.i(tag, "writing moov atom...");
        byteBufferOrder3.rewind();
        fileChannel2.write(byteBufferOrder3);
        Log.i(tag, "copying rest of file...");
        fileChannel.transferTo(jPosition, size - jPosition, fileChannel2);
        return true;
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.clear();
        int i = fileChannel.read(byteBuffer);
        byteBuffer.flip();
        return i == byteBuffer.capacity();
    }

    private final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf(tag, "Failed to close file: ");
            }
        }
    }

    public final boolean start(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        file2.getClass();
        Closeable closeable = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    channel.getClass();
                    channel2.getClass();
                    boolean zConvert = convert(channel, channel2);
                    safeClose(fileInputStream);
                    safeClose(fileOutputStream);
                    if (!zConvert) {
                        file2.delete();
                    }
                    return zConvert;
                } catch (Throwable th) {
                    th = th;
                    closeable = fileInputStream;
                    safeClose(closeable);
                    safeClose(fileOutputStream);
                    file2.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        byteBuffer.clear();
        int i = fileChannel.read(byteBuffer, j);
        byteBuffer.flip();
        return i == byteBuffer.capacity();
    }
}
