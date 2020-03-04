// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/user_lists.proto

package com.google.ads.googleads.v3.common;

public interface RuleBasedUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.RuleBasedUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The status of pre-population. The field is default to NONE if not set which
   * means the previous users will not be considered. If set to REQUESTED, past
   * site visitors or app users who match the list definition will be included
   * in the list (works on the Display Network only). This will only
   * add past users from within the last 30 days, depending on the
   * list's membership duration and the date when the remarketing tag is added.
   * The status will be updated to FINISHED once request is processed, or FAILED
   * if the request fails.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus prepopulation_status = 1;</code>
   */
  int getPrepopulationStatusValue();
  /**
   * <pre>
   * The status of pre-population. The field is default to NONE if not set which
   * means the previous users will not be considered. If set to REQUESTED, past
   * site visitors or app users who match the list definition will be included
   * in the list (works on the Display Network only). This will only
   * add past users from within the last 30 days, depending on the
   * list's membership duration and the date when the remarketing tag is added.
   * The status will be updated to FINISHED once request is processed, or FAILED
   * if the request fails.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus prepopulation_status = 1;</code>
   */
  com.google.ads.googleads.v3.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus getPrepopulationStatus();

  /**
   * <pre>
   * User lists defined by combining two rules.
   * There are two operators: AND, where the left and right operands have to
   * be true; AND_NOT where left operand is true but right operand is false.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CombinedRuleUserListInfo combined_rule_user_list = 2;</code>
   */
  boolean hasCombinedRuleUserList();
  /**
   * <pre>
   * User lists defined by combining two rules.
   * There are two operators: AND, where the left and right operands have to
   * be true; AND_NOT where left operand is true but right operand is false.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CombinedRuleUserListInfo combined_rule_user_list = 2;</code>
   */
  com.google.ads.googleads.v3.common.CombinedRuleUserListInfo getCombinedRuleUserList();
  /**
   * <pre>
   * User lists defined by combining two rules.
   * There are two operators: AND, where the left and right operands have to
   * be true; AND_NOT where left operand is true but right operand is false.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CombinedRuleUserListInfo combined_rule_user_list = 2;</code>
   */
  com.google.ads.googleads.v3.common.CombinedRuleUserListInfoOrBuilder getCombinedRuleUserListOrBuilder();

  /**
   * <pre>
   * Visitors of a page during specific dates. The visiting periods are
   * defined as follows:
   * Between start_date (inclusive) and end_date (inclusive);
   * Before end_date (exclusive) with start_date = 2000-01-01;
   * After start_date (exclusive) with end_date = 2037-12-30.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.DateSpecificRuleUserListInfo date_specific_rule_user_list = 3;</code>
   */
  boolean hasDateSpecificRuleUserList();
  /**
   * <pre>
   * Visitors of a page during specific dates. The visiting periods are
   * defined as follows:
   * Between start_date (inclusive) and end_date (inclusive);
   * Before end_date (exclusive) with start_date = 2000-01-01;
   * After start_date (exclusive) with end_date = 2037-12-30.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.DateSpecificRuleUserListInfo date_specific_rule_user_list = 3;</code>
   */
  com.google.ads.googleads.v3.common.DateSpecificRuleUserListInfo getDateSpecificRuleUserList();
  /**
   * <pre>
   * Visitors of a page during specific dates. The visiting periods are
   * defined as follows:
   * Between start_date (inclusive) and end_date (inclusive);
   * Before end_date (exclusive) with start_date = 2000-01-01;
   * After start_date (exclusive) with end_date = 2037-12-30.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.DateSpecificRuleUserListInfo date_specific_rule_user_list = 3;</code>
   */
  com.google.ads.googleads.v3.common.DateSpecificRuleUserListInfoOrBuilder getDateSpecificRuleUserListOrBuilder();

  /**
   * <pre>
   * Visitors of a page. The page visit is defined by one boolean rule
   * expression.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpressionRuleUserListInfo expression_rule_user_list = 4;</code>
   */
  boolean hasExpressionRuleUserList();
  /**
   * <pre>
   * Visitors of a page. The page visit is defined by one boolean rule
   * expression.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpressionRuleUserListInfo expression_rule_user_list = 4;</code>
   */
  com.google.ads.googleads.v3.common.ExpressionRuleUserListInfo getExpressionRuleUserList();
  /**
   * <pre>
   * Visitors of a page. The page visit is defined by one boolean rule
   * expression.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpressionRuleUserListInfo expression_rule_user_list = 4;</code>
   */
  com.google.ads.googleads.v3.common.ExpressionRuleUserListInfoOrBuilder getExpressionRuleUserListOrBuilder();

  public com.google.ads.googleads.v3.common.RuleBasedUserListInfo.RuleBasedUserListCase getRuleBasedUserListCase();
}
