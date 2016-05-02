/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl1.services.ADSLGrammarAccess;

@SuppressWarnings("all")
public class ADSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ADSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_q;
	protected AbstractElementAlias match_PrintInst___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ADSLGrammarAccess) access;
		match_Primary_LeftParenthesisKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_PrintInst___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPrintInstAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPrintInstAccess().getIDTerminalRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Primary_LeftParenthesisKeyword_0_0_q.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrintInst___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a.equals(syntax))
				emit_PrintInst___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' type=VariableType
	 *     (rule start) (ambiguity) 'here' (rule start)
	 *     (rule start) (ambiguity) 'new' type=VariableType
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) 'this' (rule start)
	 *     (rule start) (ambiguity) base=[VarDef|ID]
	 *     (rule start) (ambiguity) ref=[VarDef|ID]
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=IntegerNegative
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {MemberSelection.receiver=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' ID)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Console' (ambiguity) '(' expression=Expression
	 */
	protected void emit_PrintInst___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}