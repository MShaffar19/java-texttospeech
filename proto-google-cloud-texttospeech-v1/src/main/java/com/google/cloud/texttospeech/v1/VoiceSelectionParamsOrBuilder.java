// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

public interface VoiceSelectionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.VoiceSelectionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The language (and optionally also the region) of the voice expressed as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
   * "en-US". Required. This should not include a script tag (e.g. use
   * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
   * from the input provided in the SynthesisInput.  The TTS service
   * will use this parameter to help choose an appropriate voice.  Note that
   * the TTS service may choose a voice with a slightly different language code
   * than the one selected; it may substitute a different region
   * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
   * available), or even a different language, e.g. using "nb" (Norwegian
   * Bokmal) instead of "no" (Norwegian)".
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language (and optionally also the region) of the voice expressed as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
   * "en-US". Required. This should not include a script tag (e.g. use
   * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
   * from the input provided in the SynthesisInput.  The TTS service
   * will use this parameter to help choose an appropriate voice.  Note that
   * the TTS service may choose a voice with a slightly different language code
   * than the one selected; it may substitute a different region
   * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
   * available), or even a different language, e.g. using "nb" (Norwegian
   * Bokmal) instead of "no" (Norwegian)".
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The name of the voice. Optional; if not set, the service will choose a
   * voice based on the other parameters such as language_code and gender.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the voice. Optional; if not set, the service will choose a
   * voice based on the other parameters such as language_code and gender.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The preferred gender of the voice. Optional; if not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * name. Note that this is only a preference, not requirement; if a
   * voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
   */
  int getSsmlGenderValue();
  /**
   *
   *
   * <pre>
   * The preferred gender of the voice. Optional; if not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * name. Note that this is only a preference, not requirement; if a
   * voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
   */
  com.google.cloud.texttospeech.v1.SsmlVoiceGender getSsmlGender();
}
